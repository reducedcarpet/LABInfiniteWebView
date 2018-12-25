package net.firestaff.mcp.LABInfiniteWebView.service;

import net.firestaff.mcp.LABInfiniteWebView.dao.PatternModelRepository;
import net.firestaff.mcp.LABInfiniteWebView.model.PatternModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class PatternModelController {
    PatternModelRepository patternModelRepository;

    @Autowired
    public PatternModelController(PatternModelRepository patternModelRepository) {
        this.patternModelRepository = patternModelRepository;
    }

    @GetMapping("/pattern/viewpattern/{id}")
    public String viewPatternModel(@PathVariable("id") long id, Model model) {
        PatternModel patternModel = patternModelRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid pattern Id:" + id));

        model.addAttribute("pattern", patternModel);
        return "pattern/viewpattern";
    }

    @GetMapping("/pattern/show")
    public String showPatterns(Model model) {
        model.addAttribute("patternsDB", patternModelRepository.findAll());
        return "pattern/show";
    }
}
