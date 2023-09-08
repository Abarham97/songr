package com.abarham97.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CapitalizeController {
    @GetMapping("/capitalize/{text}")
    public String capitalize(@PathVariable String text, Model model) {
        String capitalizedText = text.toUpperCase();
        model.addAttribute("capitalizedText", capitalizedText);
        return "capitalize";
    }
}
