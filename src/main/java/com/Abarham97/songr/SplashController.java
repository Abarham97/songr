package com.Abarham97.songr;

import org.springframework.web.bind.annotation.GetMapping;

public class SplashController {
    @GetMapping("/")
    public String splash() {
        return "splash";
    }
    }
