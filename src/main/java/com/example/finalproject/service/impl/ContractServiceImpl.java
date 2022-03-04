package com.example.finalproject.service.impl;

import com.example.finalproject.entity.Contract;
import com.example.finalproject.repository.ContractRepository;
import com.example.finalproject.repository.IndividualRepository;
import com.example.finalproject.repository.OrganizationRepository;
import com.example.finalproject.service.ContractService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContractServiceImpl implements ContractService {

    private final ContractRepository contractRepository;


    public ContractServiceImpl(ContractRepository contractRepository) {
        this.contractRepository = contractRepository;
    }

    @Override
    public List<Contract> findAll() {
        return (List<Contract>) contractRepository.findAll();
    }

    @Override
    public Contract findById(long id) {
        Contract contract = null;
        Optional<Contract> tempContract = contractRepository.findById(id);
        if(tempContract.isPresent())
            contract = tempContract.get();
        return contract;
    }

    @Override
    public void save(Contract contract) {
    contractRepository.save(contract);
    }

    @Override
    public void deleteById(long id) {
    contractRepository.deleteById(id);
    }
}
