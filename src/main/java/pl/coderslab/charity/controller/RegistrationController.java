package pl.coderslab.charity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistrationController {

    @RequestMapping("/register")
    public String registerForm() {

        return "/register";
    }

    @PostMapping("/register")
    public String registerSave() {

        return "redirect:/login";
    }
}
