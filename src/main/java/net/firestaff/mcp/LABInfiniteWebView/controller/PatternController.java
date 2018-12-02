package net.firestaff.mcp.LABInfiniteWebView.controller;

import net.firestaff.mcp.LABInfiniteWebView.dao.PatternRepository;
import net.firestaff.mcp.LABInfiniteWebView.model.FullPatternView;
import net.firestaff.mcp.LABInfiniteWebView.model.PatternView;
import net.firestaff.mcp.baselab.patterns.Pattern;
import net.firestaff.mcp.baselab.patterns.Patterns;
import net.firestaff.mcp.baselab.patterns.PatternsVTG;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class PatternController {

    @Autowired
    PatternRepository patternRepo;

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/pattern")
    public String pattern(@RequestParam(value="propType", defaultValue="Staff") String prop,
                          @RequestParam(value="framework", defaultValue="VTG") String framework,
                          @RequestParam(value="category", defaultValue="Isolation") String patternList,
                          @RequestParam(value="name", defaultValue="") String name, Model model) {
        List<Pattern> patterns;
        if(framework.equalsIgnoreCase("OG")) patterns = Patterns.patternMasterMap.get(patternList);
        else patterns = PatternsVTG.patternMasterMap.get(patternList);

        Pattern result = patterns.get(0);

        String unsafeName = name.replaceAll("%7C", "\\|");

        for(Pattern p : patterns) {
            if(p.getName().equals(unsafeName)) result = p;
        }

        model.addAttribute("patternList", Patterns.patternList);

        String safeName = name.replaceAll("%7C","\u007C" );
        //System.out.println("SAFENAME: " + safeName);
        FullPatternView full = patternRepo.findByPatternName(unsafeName).get(0);
        //FullPatternView full = patternRepo.findByPatternName(unsafeName, true).get(0);


        model.addAttribute("patternName", full.getPatternName());
        model.addAttribute("patternCategory", full.getPatternCategory());

        model.addAttribute("leftText", result.getLeftText());
        model.addAttribute("rightText", result.getRightText());

        PatternView left = new PatternView();
        left.parsePropText(result.getLeftText());
        PatternView right = new PatternView();
        right.parsePropText(result.getRightText());

        String propDirectionLeft = "CW";
        String propDirectionRight = "CW";
        String pathDirectionLeft = "CW";
        String pathDirectionRight = "CW";
        if(left.propDirection == 1) propDirectionLeft = "CCW";
        if(right.propDirection == 1) propDirectionRight = "CCW";
        if(left.pathDirection == 1) pathDirectionLeft = "CCW";
        if(right.pathDirection == 1) pathDirectionRight = "CCW";

        model.addAttribute("shapeLeft", left.shape);
        model.addAttribute("shapeRight", right.shape);
        model.addAttribute("complexShapeLeft", left.complexShape);
        model.addAttribute("complexShapeRight", right.complexShape);
        model.addAttribute("propDirectionLeft", propDirectionLeft);
        model.addAttribute("propDirectionRight", propDirectionRight);
        model.addAttribute("pathDirectionLeft", pathDirectionLeft);
        model.addAttribute("pathDirectionRight", pathDirectionRight);

        model.addAttribute("propAngleModLeft", Math.toDegrees(left.propAngleModifier));
        model.addAttribute("propAngleModRight", Math.toDegrees(right.propAngleModifier));
        model.addAttribute("pathAngleModLeft", Math.toDegrees(left.pathAngleModifier));
        model.addAttribute("pathAngleModRight", Math.toDegrees(right.pathAngleModifier));

        model.addAttribute("pathRotationLeft", Math.toDegrees(left.pathRotation));
        model.addAttribute("pathRotationRight", Math.toDegrees(right.pathRotation));
        model.addAttribute("pathSizeModLeft", left.pathSizeModifier);
        model.addAttribute("pathSizeModRight", right.pathSizeModifier);
        model.addAttribute("pathSpeedLeft", left.pathSpeed);
        model.addAttribute("pathSpeedRight", right.pathSpeed);
        model.addAttribute("propSpeedLeft", left.propSpeed);
        model.addAttribute("propSpeedRight", right.propSpeed);

        model.addAttribute("positionLeft", left.xAdj + "," + left.yAdj);
        model.addAttribute("positionRight", right.xAdj + "," + right.yAdj);

        model.addAttribute("pivotXLeft", left.pivotX);
        model.addAttribute("pivotXRight", right.pivotX);

        model.addAttribute("speedControlLeft", left.speedControl);
        model.addAttribute("speedControlRight", right.speedControl);
        model.addAttribute("speedControlModLeft", Math.toDegrees(left.speedChangeModifier));
        model.addAttribute("speedControlModRight", Math.toDegrees(right.speedChangeModifier));
        model.addAttribute("upperSpeedLeft", left.upperSpeed);
        model.addAttribute("upperSpeedRight", right.upperSpeed);
        model.addAttribute("lowerSpeedLeft", left.lowerSpeed);
        model.addAttribute("lowerSpeedRight", right.lowerSpeed);

        model.addAttribute("dirControlLeft", left.directionControl);
        model.addAttribute("dirControlRight", right.directionControl);
        model.addAttribute("dirControlModLeft", Math.toDegrees(left.directionChangeModifier));
        model.addAttribute("dirControlModRight", Math.toDegrees(right.directionChangeModifier));

        model.addAttribute("useGravityLeft", left.useGravity);
        model.addAttribute("useGravityRight", right.useGravity);
        model.addAttribute("usePendulumLeft", left.usePendulums);
        model.addAttribute("usePendulumRight", right.usePendulums);

        model.addAttribute("use3DLeft", left.use3D);
        model.addAttribute("use3DRight", right.use3D);
        model.addAttribute("zShapeLeft", left.zShape);
        model.addAttribute("zShapeRight", right.zShape);
        model.addAttribute("zShapeModLeft", Math.toDegrees(left.mod3D));
        model.addAttribute("zShapeModRight", Math.toDegrees(right.mod3D));

        return "pattern";
    } /**/

    //@RequestParam(name="name", required=false, defaultValue="World") String name, Model model
}
