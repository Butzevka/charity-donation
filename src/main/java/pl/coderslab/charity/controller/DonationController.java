package pl.coderslab.charity.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pl.coderslab.charity.model.Donation;
import pl.coderslab.charity.model.User;
import pl.coderslab.charity.service.CategoryServiceImpl;
import pl.coderslab.charity.service.DonationServiceImpl;
import pl.coderslab.charity.service.InstitutionServiceImpl;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
public class DonationController {

    private final CategoryServiceImpl categoryService;
    private final InstitutionServiceImpl institutionService;
    private final DonationServiceImpl donationService;

    @ModelAttribute("command")
    public User defaultInstance() {
        User guest = new User();
        return guest;
    }

    @RequestMapping("/donate")
    public String donate(Model model) {
        model.addAttribute("institutions", institutionService.getAll());
        model.addAttribute("categories", categoryService.findAll());
        model.addAttribute("donation", new Donation());
        return "/form";
    }

    @PostMapping("/donate")
    public String saveDonation(@Valid Donation donation, BindingResult result, RedirectAttributes redirectAttributes) {
        if (result.hasErrors()) {
            return "/form";
        }
        donationService.saveDonation(donation);
        redirectAttributes.addFlashAttribute("message", "Dziękujemy za przesłanie formularza Na maila prześlemy " +
                "wszelkie informacje o odbiorze.");
        return "redirect:/confirmation";
    }

    @RequestMapping("/confirmation")
    public String confirm() {
        return "/confirmation";
    }



}
