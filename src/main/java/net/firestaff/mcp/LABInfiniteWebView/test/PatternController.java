package net.firestaff.mcp.LABInfiniteWebView.test;

import net.firestaff.mcp.baselab.patterns.Pattern;
import net.firestaff.mcp.baselab.patterns.Patterns;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class PatternController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/pattern")
    public String pattern(@RequestParam(value="category", defaultValue="Isolation") String patternList, @RequestParam(value="name", defaultValue="World") String name, Model model) {
        List<Pattern> patterns = Patterns.patternMasterMap.get(patternList);
        Pattern result = patterns.get(0);

        for(Pattern p : patterns) {
            if(p.getName().equals(name)) result = p;
        }

        model.addAttribute("patternList", Patterns.patternList);

        model.addAttribute("name", name);
        model.addAttribute("category", patternList);

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

        model.addAttribute("propAngleModLeft", left.propAngleModifier);
        model.addAttribute("propAngleModRight", right.propAngleModifier);
        model.addAttribute("pathAngleModLeft", left.pathAngleModifier);
        model.addAttribute("pathAngleModRight", right.pathAngleModifier);

        model.addAttribute("pathRotationLeft", left.pathRotation);
        model.addAttribute("pathRotationRight", right.pathRotation);
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
        model.addAttribute("speedControlModLeft", left.speedChangeModifier);
        model.addAttribute("speedControlModRight", right.speedChangeModifier);
        model.addAttribute("upperSpeedLeft", left.upperSpeed);
        model.addAttribute("upperSpeedRight", right.upperSpeed);
        model.addAttribute("lowerSpeedLeft", left.lowerSpeed);
        model.addAttribute("lowerSpeedRight", right.lowerSpeed);

        model.addAttribute("dirControlLeft", left.directionControl);
        model.addAttribute("dirControlRight", right.directionControl);
        model.addAttribute("dirControlModLeft", left.directionChangeModifier);
        model.addAttribute("dirControlModRight", right.directionChangeModifier);

        model.addAttribute("useGravityLeft", left.useGravity);
        model.addAttribute("useGravityRight", right.useGravity);
        model.addAttribute("usePendulumLeft", left.usePendulums);
        model.addAttribute("usePendulumRight", right.usePendulums);

        model.addAttribute("use3DLeft", left.use3D);
        model.addAttribute("use3DRight", right.use3D);
        model.addAttribute("zShapeLeft", left.zShape);
        model.addAttribute("zShapeRight", right.zShape);
        model.addAttribute("zShapeModLeft", left.mod3D);
        model.addAttribute("zShapeModRight", right.mod3D);

        return "Pattern";
    } /**/

    //@RequestParam(name="name", required=false, defaultValue="World") String name, Model model
}
