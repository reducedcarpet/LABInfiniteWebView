package net.firestaff.mcp.LABInfiniteWebView.service;

import net.firestaff.mcp.LABInfiniteWebView.dao.UserPatternsRepository;
import net.firestaff.mcp.LABInfiniteWebView.model.UserPatternsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserPatternsController {

    UserPatternsRepository userPatternsRepository;

    @Autowired
    public UserPatternsController(UserPatternsRepository userPatternsRepository) {
        this.userPatternsRepository = userPatternsRepository;
    }

    @GetMapping("/userpattern")
    public String showSignUpForm(UserPatternsModel userPatternsModel) {
        return "add-user-pattern";
    }

    @PostMapping("/adduserpattern")
    public String addUser(@Valid UserPatternsModel userPatternsModel, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-user-pattern";
        }

        userPatternsRepository.save(userPatternsModel);
        model.addAttribute("userPatterns", userPatternsRepository.findAll());
        return "userpatterns";
    }

    @GetMapping("/edituserpattern/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        UserPatternsModel userPatternsModel = userPatternsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));

        model.addAttribute("userPatternsModel", userPatternsModel);
        return "update-user-patterns";
    }

    @PostMapping("/updateuserpattern/{id}")
    public String updateUserPatterns(@PathVariable("id") long id, @Valid UserPatternsModel userPatternsModel,
                             BindingResult result, Model model) {
        if (result.hasErrors()) {
            //user.setId(id);
            return "update-user-patterns";
        }

        userPatternsRepository.save(userPatternsModel);
        model.addAttribute("userPatterns", userPatternsRepository.findAll());
        return "userpatterns";
    }

    @GetMapping("/deleteuserpattern/{id}")
    public String deleteUser(@PathVariable("id") long id, Model model) {
        UserPatternsModel userPatternsModel = userPatternsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        userPatternsRepository.delete(userPatternsModel);
        model.addAttribute("userPatterns", userPatternsRepository.findAll());
        return "userpatterns";
    }
}
