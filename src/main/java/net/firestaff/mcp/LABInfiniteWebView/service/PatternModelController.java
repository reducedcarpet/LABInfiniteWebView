package net.firestaff.mcp.LABInfiniteWebView.service;

import net.firestaff.mcp.LABInfiniteWebView.comm.HttpBuilder;
import net.firestaff.mcp.LABInfiniteWebView.dao.PatternModelRepository;
import net.firestaff.mcp.LABInfiniteWebView.form.StringCommand;
import net.firestaff.mcp.LABInfiniteWebView.model.PatternModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collections;
import java.util.List;

@Controller
public class PatternModelController {
    PatternModelRepository patternModelRepository;

    @Autowired
    public PatternModelController(PatternModelRepository patternModelRepository) {
        this.patternModelRepository = patternModelRepository;
    }

    @GetMapping("/pattern/view/{id}")
    public String viewPatternModel(@PathVariable("id") long id, Model model) {
        PatternModel patternModel = patternModelRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid pattern Id:" + id));

        model.addAttribute("pattern", patternModel);
        return "pattern/view";
    }

    @GetMapping("/pattern/webgl/{id}")
    public String view3D(@PathVariable("id") long id, Model model) {
        PatternModel patternModel = patternModelRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid pattern Id:" + id));

        model.addAttribute("textpattern", HttpBuilder.build(patternModel));
        return "redirect:http://tutorials.firestaff.net/Build/" + HttpBuilder.build(patternModel);
    }

    @GetMapping("/pattern/show")
    public String showPatterns(Model model) {
        model.addAttribute("patternsDB", patternModelRepository.findAll());
        return "pattern/show";
    }

    @PostMapping("/pattern/show")
    public String showCategorySelect(@ModelAttribute("command") StringCommand command, BindingResult bindingResult, Model model) {
        //patternModelRepository.findAllByCategory(category);
        String category = command.getDropdownSelectedValue();
        model.addAttribute("patternsDB", patternModelRepository.findAllByCategory(category));
        return "pattern/show";
    }

    @GetMapping("/pattern/show/{category}")
    public String showCategory(@PathVariable("category") String category, Model model) {
        //patternModelRepository.findAllByCategory(category);
        model.addAttribute("patternsDB", patternModelRepository.findAllByCategory(category));
        return "pattern/show";
    }

    @ModelAttribute("singleSelectAllValues")
    public List<String> getSingleSelectAllValues() {
        List<String> result = patternModelRepository.findDistinctCategory();
        Collections.sort(result);
        return result;
    }

    @GetMapping("/pattern/category")
    public String showCategories(Model model) {
        model.addAttribute( "command", new StringCommand());
        List<String> result = patternModelRepository.findDistinctCategory();
        Collections.sort(result);
        model.addAttribute("categoryDB", result);
        return "pattern/categories";
    }
}
