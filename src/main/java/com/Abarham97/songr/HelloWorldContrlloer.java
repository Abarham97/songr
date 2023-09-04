package com.Abarham97.songr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldContrlloer {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

}
