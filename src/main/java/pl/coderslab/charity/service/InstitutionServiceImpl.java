package pl.coderslab.charity.service;

import lombok.RequiredArgsConstructor;
import pl.coderslab.charity.model.Institution;
import pl.coderslab.charity.repository.InstitutionRepository;

import java.util.List;

@RequiredArgsConstructor
public class InstitutionServiceImpl implements InstitutionService {

    private final InstitutionRepository institutionRepository;
    @Override
    public List<Institution> getAll() {
        return institutionRepository.getAll();
    }
}
