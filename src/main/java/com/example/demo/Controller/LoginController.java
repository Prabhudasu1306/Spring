package com.example.demo.Controller;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(@RequestParam(value = "lang", defaultValue = "en") String lang, Model model) {
        // Any logic to set up the model (e.g., username, password)
        return "login"; // Name of your Thymeleaf template
    }
}
