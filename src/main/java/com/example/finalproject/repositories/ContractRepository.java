package com.example.finalproject.repositories;

import com.example.finalproject.entity.Contract;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ContractRepository extends PagingAndSortingRepository<Contract,Long> {
}
