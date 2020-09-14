package pl.coderslab.charity.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.model.Donation;
import pl.coderslab.charity.service.CategoryServiceImpl;
import pl.coderslab.charity.service.InstitutionServiceImpl;

@Controller
@RequiredArgsConstructor
public class DonationController {

    private final CategoryServiceImpl categoryService;
    private final InstitutionServiceImpl institutionService;

    @RequestMapping("/donate")
    public String donate(Model model) {
        model.addAttribute("institutions", institutionService.getAll());
        model.addAttribute("categories", categoryService.findAll());
        model.addAttribute("donation", new Donation());
        return "/form";
    }

    @RequestMapping("/confirmation")
    public String confirm() {

        return "/confirmation";
    }

}
