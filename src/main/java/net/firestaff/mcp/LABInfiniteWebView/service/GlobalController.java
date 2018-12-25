package net.firestaff.mcp.LABInfiniteWebView.service;

import net.firestaff.mcp.LABInfiniteWebView.dao.GlobalDBRepository;
import net.firestaff.mcp.LABInfiniteWebView.model.GlobalDBModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class GlobalController {

    GlobalDBRepository globalDBRepository;

    @Autowired
    public GlobalController(GlobalDBRepository globalDBRepository) {
        this.globalDBRepository = globalDBRepository;
    }

    @GetMapping("/showglobal")
    public String showGlobal(Model model) {
        model.addAttribute("globalDB", globalDBRepository.findAll());
        return "showglobal";
    }
}
