package net.firestaff.mcp.LABInfiniteWebView.test;

import net.firestaff.mcp.baselab.patterns.Pattern;
import net.firestaff.mcp.baselab.patterns.Patterns;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class PatternController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/pattern")
    public Pattern pattern(@RequestParam(value="category", defaultValue="Isolation") String patternList, @RequestParam(value="name", defaultValue="World") String name) {
        List<Pattern> patterns = Patterns.patternMasterMap.get(patternList);
        Pattern result = patterns.get(0);

        for(Pattern p : patterns) {
            if(p.getName().equals(name)) result = p;
        }

        return result;
    }
}
