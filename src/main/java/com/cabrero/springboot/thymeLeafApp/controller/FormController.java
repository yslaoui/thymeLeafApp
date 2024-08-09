package com.cabrero.springboot.thymeLeafApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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


}
