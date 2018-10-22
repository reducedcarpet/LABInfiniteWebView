package net.firestaff.mcp.LABInfiniteWebView.test;

import javax.validation.Valid;

import net.firestaff.mcp.baselab.patterns.Patterns;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Map;


@Controller
public class WebController implements WebMvcConfigurer {

        @Override
        public void addViewControllers(ViewControllerRegistry registry) {
            registry.addViewController("/results").setViewName("results");
        }

        @GetMapping("/")
        public String showForm(PatternQuery patternQuery, Model model) {
            model.addAttribute("patternList", Patterns.patternList);
            //model.addAttribute("patternQuery", new PatternQuery());
            return "form";
        }

        @PostMapping("/")
        public String checkPersonInfo(@Valid PatternQuery query, BindingResult bindingResult) {

            if (bindingResult.hasErrors()) {
                return "form";
            }

            return "redirect:/pattern?category=" + query.getCategory() + "&name=" + query.getPatternName();
        }
}

