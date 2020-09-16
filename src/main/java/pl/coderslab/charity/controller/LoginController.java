package pl.coderslab.charity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.model.User;

@Controller
public class LoginController {

    @ModelAttribute("command")
    public User defaultInstance() {
        User guest = new User();
        return guest;
    }

    @RequestMapping("/login")
    public String loginForm(Model model) {
        model.addAttribute("user", new User());
        return "/login";
    }
}
