package net.firestaff.mcp.LABInfiniteWebView.service;

import net.firestaff.mcp.LABInfiniteWebView.dao.UserModelRepository;
import net.firestaff.mcp.LABInfiniteWebView.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {

    //@Autowired
    UserModelRepository userModelRepository;

    @Autowired
    public UserController(UserModelRepository userRepository) {
        this.userModelRepository = userRepository;
    }

    @GetMapping("/user/signup")
    public String showSignUpForm(UserModel userModel) {
        return "user/add-user";
    }

    @PostMapping("/user/adduser")
    public String addUser(@Valid UserModel userModel, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "user/add-user";
        }

        userModelRepository.save(userModel);
        model.addAttribute("users", userModelRepository.findAll());
        return "user/index";
    }

    @GetMapping("/user/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        UserModel userModel = userModelRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));

        model.addAttribute("userModel", userModel);
        return "user/update-user";
    }

    @PostMapping("/user/update/{id}")
    public String updateUser(@PathVariable("id") long id, @Valid UserModel userModel,
                             BindingResult result, Model model) {
        if (result.hasErrors()) {
            //user.setId(id);
            return "user/update-user";
        }

        userModelRepository.save(userModel);
        model.addAttribute("users", userModelRepository.findAll());
        return "user/index";
    }

    @GetMapping("/user/delete/{id}")
    public String deleteUser(@PathVariable("id") long id, Model model) {
        UserModel userModel = userModelRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        userModelRepository.delete(userModel);
        model.addAttribute("users", userModelRepository.findAll());
        return "user/index";
    }
}
