package com.example.finalproject.repository;


import com.example.finalproject.entity.InsuredPerson;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface InsuredPersonRepository extends PagingAndSortingRepository<InsuredPerson,Long> {
}
