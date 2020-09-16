package pl.coderslab.charity.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.coderslab.charity.model.Donation;
import pl.coderslab.charity.repository.DonationRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DonationServiceImpl implements DonationService{

    private final DonationRepository donationRepository;

    @Override
    public Long count() {
        return donationRepository.count();
    }

    @Override
    public List<Donation> getAll() {
        return donationRepository.findAll();
    }

    @Override
    public void saveDonation(Donation donation) {
        donationRepository.save(donation);
    }

    public int quantityDonated() {
        return getAll().stream().mapToInt(d -> d.getQuantity()).sum();
    }
}
