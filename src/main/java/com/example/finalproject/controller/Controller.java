package com.example.finalproject.controller;

import com.example.finalproject.dto.DTO;
import com.example.finalproject.entity.Contract;
import com.example.finalproject.mapper.Mapper;
import com.example.finalproject.service.ContractService;
import com.example.finalproject.service.InsuredPersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.util.stream.Collectors.toList;

@RestController
@RequestMapping("/api/contract")
public class Controller {

    private final ContractService contractService;
    private final InsuredPersonService insuredPersonService;

    public Controller(ContractService contractService, InsuredPersonService insuredPersonService) {
        this.contractService = contractService;
        this.insuredPersonService = insuredPersonService;
    }

    @GetMapping()
    public List<DTO> findAll() {/// ??
        return contractService.findAll().stream().map(Mapper::toDto).collect(toList());
    }


    @GetMapping("/{id}")
    public Contract findById(@PathVariable long id){
        return contractService.findById(id);
    }

    @PostMapping()
    public void addContract(@RequestBody DTO contract) {
    contractService.save(Mapper.toContract(contract));
    }

    @DeleteMapping("/{id}")
    public void deleteContract(@PathVariable long id){
        contractService.deleteById(id);
    }



}
