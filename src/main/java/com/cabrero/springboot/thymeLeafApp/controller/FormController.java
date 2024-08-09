package com.cabrero.springboot.thymeLeafApp.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

    @GetMapping("/showform")
    public String showTheForm() {
        return "nameform";
    }

    @GetMapping("/processform")
    public String processTheForm() {
        return "nameresult";
    }

    @GetMapping("/processformversiontwo")
    public String shoutOutLoud(HttpServletRequest request, Model model) {
        String name = request.getParameter("username").toUpperCase();
        model.addAttribute("message", name);
        return "nameresult";
    }

    @GetMapping("/processformversionthree")
    public String shoutOutLoudthree(@RequestParam("username") String theName, Model model) {
        model.addAttribute("message", theName);
        return "nameresult";
    }

}
