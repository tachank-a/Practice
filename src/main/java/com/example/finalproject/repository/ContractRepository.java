package com.example.finalproject.repository;

import com.example.finalproject.entity.Contract;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ContractRepository extends PagingAndSortingRepository<Contract,Long> {
}
