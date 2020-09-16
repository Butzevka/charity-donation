package pl.coderslab.charity.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pl.coderslab.charity.model.User;
import pl.coderslab.charity.service.UserServiceImpl;

import javax.validation.Valid;

@Log4j2
@Controller
@RequiredArgsConstructor
public class RegistrationController {

    private final UserServiceImpl userService;

    @ModelAttribute("command")
    public User defaultInstance() {
        User guest = new User();
        return guest;
    }

    @RequestMapping("/register")
    public String registerForm(Model model) {
        model.addAttribute("user", new User());
        return "/register";
    }

    @PostMapping("/register")
    public String registerSave(@Valid User user, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            log.error(bindingResult.getAllErrors());
            return "/register";
        }
        userService.saveUser(user);
        redirectAttributes.addFlashAttribute("message", "Dodano użytkownika");
        return "redirect:/login";
    }
}
