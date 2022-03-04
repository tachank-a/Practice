package com.example.finalproject.service;


import com.example.finalproject.entity.InsuredPerson;

import java.util.List;

public interface InsuredPersonService {

    public List<InsuredPerson> findAll();

    public InsuredPerson findById(long id);

    public void save(InsuredPerson contract);

    public void deleteById(long id);
}
