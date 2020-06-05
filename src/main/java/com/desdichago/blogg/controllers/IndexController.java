package com.desdichago.blogg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    String index(Model model) {
        model.addAttribute("page_name", "Index page");
        return "index";
    }

    @GetMapping("/about")
    String about(Model model) {
        model.addAttribute("page_name", "About page");
        return "index";
    }

}
