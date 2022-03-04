package com.example.finalproject.repository;

import com.example.finalproject.entity.Contract;
import com.example.finalproject.entity.Customer;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

@NoRepositoryBean
public interface CustomerRepository extends PagingAndSortingRepository<Customer,Long>{
}
