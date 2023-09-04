package com.Abarham97.songr;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class CapitalizeController {
    @GetMapping("/capitalize/{text}")
    public String capitalize(@PathVariable String text, Model model) {
        String capitalizedText = text.toUpperCase();
        model.addAttribute("capitalizedText", capitalizedText);
        return "capitalize";
    }
}
