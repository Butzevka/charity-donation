package pl.coderslab.charity.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.service.InstitutionServiceImpl;

@Controller
@RequiredArgsConstructor
@RequestMapping("/institutions")
public class InstitutionController {

    private final InstitutionServiceImpl institutionService;

    @RequestMapping("/edit/{id}")
    public String editInstitutionById(@PathVariable Long id, Model model) {

        model.addAttribute("institution", institutionService.findById(id));
        return "/admin/institution-edit";
    }
}
