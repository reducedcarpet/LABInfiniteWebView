package net.firestaff.mcp.LABInfiniteWebView;

import net.firestaff.mcp.LABInfiniteWebView.dao.PatternRepository;
import net.firestaff.mcp.LABInfiniteWebView.model.FullPatternView;
import net.firestaff.mcp.LABInfiniteWebView.model.PatternView;
import net.firestaff.mcp.baselab.patterns.Pattern;
import net.firestaff.mcp.baselab.patterns.Patterns;
import net.firestaff.mcp.baselab.patterns.PatternsVTG;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PatternLoader implements ApplicationRunner {

    private PatternRepository patternRepository;

    @Autowired
    public PatternLoader(PatternRepository patternRepository) {
        this.patternRepository = patternRepository;
    }

    public void run(ApplicationArguments args) {


        for(String category : PatternsVTG.patternMasterMap.keySet()) {
            List<Pattern> patterns = PatternsVTG.patternMasterMap.get(category);

            for(Pattern pattern : patterns) {
                FullPatternView view = new FullPatternView();
                view.setPatternName(pattern.getName());
                view.setRightPattern(new PatternView(pattern.getRightText()));
                view.setLeftPattern(new PatternView(pattern.getLeftText()));
                view.setPatternCategory(category);

                patternRepository.save(view);
            }
        }

        //patternRepository.save(new FullPatternView("lala", "lala", "lala"));
    }
}
