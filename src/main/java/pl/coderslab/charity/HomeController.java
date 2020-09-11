package pl.coderslab.charity;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.model.Category;
import pl.coderslab.charity.model.Institution;
import pl.coderslab.charity.repository.CategoryRepository;
import pl.coderslab.charity.repository.DonationRepository;
import pl.coderslab.charity.repository.InstitutionRepository;
import pl.coderslab.charity.service.DonationServiceImpl;

@AllArgsConstructor
@Controller
public class HomeController {

    private final DonationServiceImpl donationService;

    @RequestMapping("/")
    public String homeAction(Model model){
        model.addAttribute("donationCount", donationService.count());
        return "index";
    }
}
