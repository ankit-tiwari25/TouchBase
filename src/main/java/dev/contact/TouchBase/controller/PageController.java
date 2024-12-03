package dev.contact.TouchBase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/home")
    public String home(Model model){
        String message = "Welcome to TouchBase home";
        System.out.println(message);
        model.addAttribute("name", "Welcome to Touch Base");
        model.addAttribute("githubRepo", "https://github.com/ankit-tiwari25/TouchBase/tree/master");
        return "home";
    }
}
