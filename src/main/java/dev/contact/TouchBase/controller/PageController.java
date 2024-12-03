package dev.contact.TouchBase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class PageController {
    @RequestMapping("/home")
    public String home(){
        String message = "Welcome to TouchBase home";
        return "home";
    }
}
