package com.example.finalproject.service.impl;

import com.example.finalproject.entity.Contract;
import com.example.finalproject.entity.InsuredPerson;
import com.example.finalproject.repository.InsuredPersonRepository;
import com.example.finalproject.service.InsuredPersonService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InsuredPersonServiceImpl implements InsuredPersonService {

    private final InsuredPersonRepository insuredPersonRepository;

    public InsuredPersonServiceImpl(InsuredPersonRepository insuredPersonRepository) {
        this.insuredPersonRepository = insuredPersonRepository;
    }

    @Override
    public List<InsuredPerson> findAll() {
        return (List<InsuredPerson>) insuredPersonRepository.findAll();
    }

    @Override
    public InsuredPerson findById(long id) {
        InsuredPerson insuredPerson = null;
        Optional<InsuredPerson> tempInsuredPerson = insuredPersonRepository.findById(id);
        if(tempInsuredPerson.isPresent())
            insuredPerson = tempInsuredPerson.get();
        return insuredPerson;
    }

    @Override
    public void save(InsuredPerson insuredPerson) {
    insuredPersonRepository.save(insuredPerson);
    }

    @Override
    public void deleteById(long id) {
    insuredPersonRepository.deleteById(id);
    }
}
