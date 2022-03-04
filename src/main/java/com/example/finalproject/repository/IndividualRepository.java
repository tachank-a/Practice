package com.example.finalproject.repository;


import com.example.finalproject.entity.Individual;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IndividualRepository extends PagingAndSortingRepository<Individual,Long> {
}
