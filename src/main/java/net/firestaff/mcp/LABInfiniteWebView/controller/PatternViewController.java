package net.firestaff.mcp.LABInfiniteWebView.controller;

import net.firestaff.mcp.LABInfiniteWebView.model.FullPatternView;
import net.firestaff.mcp.LABInfiniteWebView.model.PatternView;
import net.firestaff.mcp.baselab.patterns.Pattern;
import net.firestaff.mcp.baselab.patterns.Patterns;
import net.firestaff.mcp.baselab.patterns.PatternsVTG;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class PatternViewController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/patternview")
    public FullPatternView patternView(@RequestParam(value="propType", defaultValue="Staff") String prop,
                                       @RequestParam(value="framework", defaultValue="VTG") String framework,
                                       @RequestParam(value="category", defaultValue="Isolation") String patternList,
                                       @RequestParam(value="name", defaultValue="World") String name) {
        List<Pattern> patterns;
        if(framework.equalsIgnoreCase("OG")) patterns = Patterns.patternMasterMap.get(patternList);
        else patterns = PatternsVTG.patternMasterMap.get(patternList);

        Pattern result = patterns.get(0);

        String unsafeName = name.replaceAll("%7C", "\\|");

        for(Pattern p : patterns) {
            if(p.getName().equals(unsafeName)) result = p;
        }

        PatternView right = new PatternView();
        PatternView left = new PatternView();
        right.parsePropText(result.getRightText());
        left.parsePropText(result.getLeftText());

        FullPatternView full = new FullPatternView();

        full.setLeft(left);
        full.setRight(right);
        full.setName(result.getName());
        full.setPropType(prop);

        return full;
    }

}
