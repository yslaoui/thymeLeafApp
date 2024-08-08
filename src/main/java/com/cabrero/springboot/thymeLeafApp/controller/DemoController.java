package com.cabrero.springboot.thymeLeafApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Controller
public class DemoController {

        @GetMapping("/hello")
        public String sayHello(Model myModel ) {
            myModel.addAttribute("date", LocalDateTime.now());
            return "hellothere";
        }
    }

