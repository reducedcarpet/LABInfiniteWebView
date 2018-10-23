package net.firestaff.mcp.LABInfiniteWebView.test;

import javax.validation.Valid;

import net.firestaff.mcp.baselab.patterns.Pattern;
import net.firestaff.mcp.baselab.patterns.Patterns;
import net.firestaff.mcp.baselab.patterns.PatternsVTG;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

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

            return "redirect:/pattern?framework=" + query.getFramework()
                    + "&propType=" + query.getPropType()
                    + "&category=" + query.getCategory()
                    + "&name=" + query.getPatternName().replaceAll("\\|", "%7C");
        }

    @GetMapping(value = "/categoryPatterns")
    public @ResponseBody
    List<Pattern> getAllPatterns(@RequestParam(value="propType", defaultValue="Staff") String prop,
                                 @RequestParam(value="framework", defaultValue="VTG") String framework,
                                 @RequestParam(value="category", required=true, defaultValue="Isolation") String category) {
        List<Pattern> patterns;
        if(framework.equalsIgnoreCase("OG")) patterns = Patterns.patternMasterMap.get(category);
        else patterns = PatternsVTG.patternMasterMap.get(category);

        return patterns;
    }
}

