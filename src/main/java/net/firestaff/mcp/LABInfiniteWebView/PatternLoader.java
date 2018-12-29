package net.firestaff.mcp.LABInfiniteWebView;

import net.firestaff.mcp.LABInfiniteWebView.dao.GlobalDBRepository;
import net.firestaff.mcp.LABInfiniteWebView.dao.PatternModelRepository;
import net.firestaff.mcp.LABInfiniteWebView.dao.PatternRepository;
import net.firestaff.mcp.LABInfiniteWebView.dao.PropPatternModelRepository;
import net.firestaff.mcp.LABInfiniteWebView.model.*;
import net.firestaff.mcp.baselab.patterns.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PatternLoader implements ApplicationRunner {

    private PatternRepository patternRepository;

    private GlobalDBRepository globalDBRepository;

    private PatternModelRepository patternModelRepository;

    private PropPatternModelRepository propPatternModelRepository;

    //@Autowired
    //public PatternLoader(PatternRepository patternRepository) {
    //    this.patternRepository = patternRepository;
    //}

    @Autowired
    public PatternLoader(GlobalDBRepository globalDBRepository, PatternModelRepository patternModelRepository, PropPatternModelRepository propPatternModelRepository) {
        this.globalDBRepository = globalDBRepository;
        this.patternModelRepository = patternModelRepository;
        this.propPatternModelRepository = propPatternModelRepository;
    }


    public void run(ApplicationArguments args) {

        for(String category : PoiPatternsVTG.patternMasterMap.keySet()) {
            List<Pattern> patterns = PoiPatternsVTG.patternMasterMap.get(category);

            for(Pattern pattern : patterns) {
                //view.setRightPattern(new PatternView(pattern.getRightText()));
                //view.setLeftPattern(new PatternView(pattern.getLeftText()));
                PropPatternModel modelLeft = new PropPatternModel();
                PropPatternModel modelRight = new PropPatternModel();
                modelLeft.setTextPattern(pattern.getLeftText());
                propPatternModelRepository.save(modelLeft);
                modelRight.setTextPattern(pattern.getRightText());
                propPatternModelRepository.save(modelRight);

                PatternModel patternModel = new PatternModel();
                patternModel.setPatternName(pattern.getName());
                patternModel.setPropOne(modelRight);
                patternModel.setPropTwo(modelLeft);
                patternModel.setPropNumber(2);
                patternModel.setCategory(category);
                patternModelRepository.save(patternModel);

                GlobalDBModel globalModel = new GlobalDBModel();
                globalModel.setPattern(patternModel);
                globalModel.setPropTypes("ALL");
                globalModel.setFramework("VTG");
                globalModel.setUserCreated(false);

                globalDBRepository.save(globalModel);
            }
        }

        for(String category : PoiPatterns.patternMasterMap.keySet()) {
            List<Pattern> patterns = PoiPatterns.patternMasterMap.get(category);

            for(Pattern pattern : patterns) {
                //view.setRightPattern(new PatternView(pattern.getRightText()));
                //view.setLeftPattern(new PatternView(pattern.getLeftText()));
                PropPatternModel modelLeft = new PropPatternModel();
                PropPatternModel modelRight = new PropPatternModel();
                modelLeft.setTextPattern(pattern.getLeftText());
                propPatternModelRepository.save(modelLeft);
                modelRight.setTextPattern(pattern.getRightText());
                propPatternModelRepository.save(modelRight);

                PatternModel patternModel = new PatternModel();
                patternModel.setPatternName(pattern.getName());
                patternModel.setPropOne(modelRight);
                patternModel.setPropTwo(modelLeft);
                patternModel.setPropNumber(2);
                patternModel.setCategory(category);
                patternModelRepository.save(patternModel);

                GlobalDBModel globalModel = new GlobalDBModel();
                globalModel.setPattern(patternModel);
                globalModel.setPropTypes("ALL");
                globalModel.setFramework("OGF");
                globalModel.setUserCreated(false);

                globalDBRepository.save(globalModel);
            }
        }


        /*

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
        } /**/

        //patternRepository.save(new FullPatternView("lala", "lala", "lala"));
    }
}
