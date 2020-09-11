package pl.coderslab.charity.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.charity.repository.DonationRepository;

@Service
@RequiredArgsConstructor
public class DonationServiceImpl implements DonationService{

    private final DonationRepository donationRepository;

    @Override
    public Long count() {
        return donationRepository.count();
    }
}
