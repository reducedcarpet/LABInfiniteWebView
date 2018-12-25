package net.firestaff.mcp.LABInfiniteWebView.service;

import net.firestaff.mcp.LABInfiniteWebView.dao.PropPatternModelRepository;
import net.firestaff.mcp.LABInfiniteWebView.model.PropPatternModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class PropPatternController {

    PropPatternModelRepository propPatternModelRepository;

    @Autowired
    public PropPatternController(PropPatternModelRepository propPatternModelRepository) {
        this.propPatternModelRepository = propPatternModelRepository;
    }

    @GetMapping("/proppattern/view/{id}")
    public String viewPropPatternModel(@PathVariable("id") long id, Model model) {
        PropPatternModel propPatternModel = propPatternModelRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid pattern Id:" + id));

        model.addAttribute("pattern", propPatternModel);
        return "proppattern/view";
    }

    @GetMapping("/proppattern/show")
    public String showPatterns(Model model) {
        model.addAttribute("propPatternsDB", propPatternModelRepository.findAll());
        return "proppattern/show";
    }
}
