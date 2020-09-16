package pl.coderslab.charity.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.model.User;
import pl.coderslab.charity.service.DonationServiceImpl;
import pl.coderslab.charity.service.InstitutionServiceImpl;

@RequiredArgsConstructor
@Controller
public class HomeController {

    private final DonationServiceImpl donationService;
    private final InstitutionServiceImpl institutionService;

    @ModelAttribute("command")
    public User defaultInstance() {
        User guest = new User();
        return guest;
    }

    @RequestMapping("/")
    public String homeAction(Model model){
        model.addAttribute("donationCount", donationService.count());
        model.addAttribute("quantityDonated", donationService.quantityDonated());
        model.addAttribute("institutions", institutionService.getAll());
        return "index";
    }
}
