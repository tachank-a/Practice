package com.example.finalproject.repository;


import com.example.finalproject.entity.Organization;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface OrganizationRepository extends PagingAndSortingRepository<Organization,Long> {
}
