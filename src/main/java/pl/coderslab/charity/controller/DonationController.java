package pl.coderslab.charity.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.model.Donation;
import pl.coderslab.charity.service.CategoryServiceImpl;

@Controller
@RequiredArgsConstructor
public class DonationController {

    private final CategoryServiceImpl categoryService;

    @RequestMapping("/donate")
    public String donate(Model model) {
        model.addAttribute("categories", categoryService.findAll());
        model.addAttribute("donation", new Donation());
        return "/form";
    }

}
