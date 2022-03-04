package com.example.finalproject.mapper;

import com.example.finalproject.dto.DTO;
import com.example.finalproject.entity.Contract;
import com.example.finalproject.entity.Individual;

public class Mapper {
    public static DTO toDto(Contract contract) {
        DTO contractDTO = new DTO();
        contractDTO.setId(contract.getId());
        contractDTO.setContractNumber(contract.getContractNumber());
        contractDTO.setDateStart(contract.getDateStart());
        contractDTO.setDateEnd(contract.getDateEnd());
        contractDTO.setDateConclusion(contract.getDateConclusion());
        contractDTO.setSum(contract.getSum());
        contractDTO.setPremium(contract.getPremium());
        contractDTO.setInsuredPerson(contract.getInsuredPerson());
        contractDTO.setCustomers(contract.getCustomers());
        return contractDTO;
    }

    public static Contract toContractIndividual(DTO contractDTO){
        Individual contract = new Individual();
        contract.setId(contractDTO.getId());
        contract.setDob(contractDTO.getIndividual().getDob());
        contract.setFirstName(contractDTO.getIndividual().getFirstName());
        contract.setMiddleName(contractDTO.getIndividual().getMiddleName());
        contract.setDateConclusion(contractDTO.getIndividual().getLastName());
        contract.setSum(contractDTO.getSum());
        contract.setPremium(contractDTO.getPremium());
        contract.setInsuredPerson(contractDTO.getInsuredPerson());
        contract.setIn(contractDTO.getCustomers());
        return contract;
    }

    public static Contract toContractOrganization(DTO contractDTO){
        Contract contract = new Contract();
        contract.setId(contractDTO.getId());
        contract.setContractNumber(contractDTO.getContractNumber());
        contract.setDateStart(contractDTO.getDateStart());
        contract.setDateEnd(contractDTO.getDateEnd());
        contract.setDateConclusion(contractDTO.getDateConclusion());
        contract.setSum(contractDTO.getSum());
        contract.setPremium(contractDTO.getPremium());
        contract.setInsuredPerson(contractDTO.getInsuredPerson());
        contract.setCustomers(contractDTO.getCustomers());
        return contract;
    }


}
