package pl.coderslab.charity.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.service.InstitutionServiceImpl;

import java.security.Principal;

@Controller
@RequiredArgsConstructor
@Secured("ROLE_ADMIN")
public class AdminController {

    private final InstitutionServiceImpl institutionService;

    @RequestMapping("/admin")
    public String adminHome(Principal principal) {

        return "/admin/dashboard";
    }
    @RequestMapping("/admin/institutions")
    public String institutionList(Model model) {
        model.addAttribute("institutions", institutionService.getAll());
        return "/admin/institutions";
    }
 }
