package com.example.finalproject.service;

import com.example.finalproject.entity.Contract;

import java.util.List;

public interface ContractService {

    public List<Contract> findAll();

    public Contract findById(long id);

    public void save(Contract contract);

    public void deleteById(long id);

}
