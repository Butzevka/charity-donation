package pl.coderslab.charity.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequiredArgsConstructor
@Secured("ROLE_ADMIN")
public class AdminController {

    @RequestMapping("/admin")
    public String adminHome(Principal principal) {

        return "/admin/dashboard";
    }
 }
