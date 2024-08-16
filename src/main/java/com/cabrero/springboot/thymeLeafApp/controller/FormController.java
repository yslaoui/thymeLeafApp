package com.cabrero.springboot.thymeLeafApp.controller;

import com.cabrero.springboot.thymeLeafApp.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.apache.catalina.util.ToStringUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class FormController {

    @InitBinder
    public void trimStrings(WebDataBinder binder) {
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    }

    @Value("${countries}")
    private List<String> countries;

    @Value("${codingLanguages}")
    private List<String> codingLanguages;

    @Value("${preferredOSs}")
    private List<String> preferredOSs;



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

    @PostMapping("/processformversionthree")
    public String shoutOutLoudthree(@RequestParam("username") String theName, Model model) {
        model.addAttribute("message", theName);
        return "nameresult";
    }

    @GetMapping("/studentForm")
    public String studentForm(Model model) {
        model.addAttribute("student", new Student());
        model.addAttribute("countries", countries);
        model.addAttribute("codingLanguages", codingLanguages);
        model.addAttribute("preferredOSs", preferredOSs);
        return "studentform";
    }

    @PostMapping("/processStudentForm")
    public String processForm(
            @Valid  @ModelAttribute("student") Student theStudent,
            BindingResult theBindingResult, Model model
    ) {
        // Always re-populate the model with the necessary attributes
        model.addAttribute("countries", countries);
        model.addAttribute("codingLanguages", codingLanguages);
        model.addAttribute("preferredOSs", preferredOSs);
        System.out.println("\n\n\n\n\n");
        System.out.println("The binding result is " + theBindingResult);
        if (theBindingResult.hasErrors()) {
            return "studentform";
        }
        else {
            return "studentconfirmation";
        }
    }

}


