package net.firestaff.mcp.LABInfiniteWebView.controller;

import net.firestaff.mcp.LABInfiniteWebView.dao.PatternRepository;
import net.firestaff.mcp.LABInfiniteWebView.model.FullPatternView;
import net.firestaff.mcp.baselab.patterns.Pattern;
import net.firestaff.mcp.baselab.patterns.Patterns;
import net.firestaff.mcp.baselab.patterns.PatternsVTG;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class PatternViewController {

    @Autowired
    PatternRepository patternRepo;

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/patternview")
    public FullPatternView patternView(@RequestParam(value="propType", defaultValue="Staff") String prop,
                                       @RequestParam(value="framework", defaultValue="VTG") String framework,
                                       @RequestParam(value="category", defaultValue="Isolation") String patternList,
                                       @RequestParam(value="name", defaultValue="World") String name) {
        //List<Pattern> patterns;
       // if(framework.equalsIgnoreCase("OG")) patterns = Patterns.patternMasterMap.get(patternList);
        //else patterns = PatternsVTG.patternMasterMap.get(patternList);

        //Pattern result = patterns.get(0);

        String unsafeName = name.replaceAll("%7C", "\\|");

       // for(Pattern p : patterns) {
        //    if(p.getName().equals(unsafeName)) result = p;
        //}


        //PatternView right = new PatternView();
        //PatternView left = new PatternView();
        //right.parsePropText(result.getRightText());
        //left.parsePropText(result.getLeftText());

        FullPatternView full = patternRepo.findByPatternName(unsafeName).get(0);


        //full.setLeftText(result.getLeftText());
        //full.setRightText(result.getRightText());
        //full.setPatternName(result.getName());
        //full.setPropType(prop);

        return full;
    }

}
