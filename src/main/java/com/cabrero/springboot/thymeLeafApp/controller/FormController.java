package com.cabrero.springboot.thymeLeafApp.controller;

import com.cabrero.springboot.thymeLeafApp.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.catalina.util.ToStringUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class FormController {
    @Value("${countries}")
    private List<String> countries;

    @Value("${codingLanguages}")
    private List<String> codingLanguages;

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
        return "studentform";
    }

    @PostMapping("/processStudentForm")
    public String processForm(@ModelAttribute("student") Student theStudent) {
        System.out.println("the student " + theStudent.getFirstName() + " " + theStudent.getLastName());
        return "studentconfirmation";
    }

}
