package pl.coderslab.charity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.model.Donation;

@Controller
public class DonationController {

    @RequestMapping("/donate")
    public String donate(Model model) {
        model.addAttribute("donation", new Donation());
        return "/form/form-1-category";
    }

}
