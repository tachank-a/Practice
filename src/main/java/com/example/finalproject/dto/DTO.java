package com.example.finalproject.dto;

import com.example.finalproject.entity.Individual;
import com.example.finalproject.entity.InsuredPerson;
import com.example.finalproject.entity.Organization;

import java.util.Date;
import java.util.Set;

public class DTO {

    private long id;
    private String contractNumber;
    private Date dateStart;
    private Date dateEnd;
    private Date dateConclusion;
    private double sum;
    private double premium;
    private Set<InsuredPerson> insuredPerson;
    private Individual individual;
    private Organization organization;

//    @GeneratedValue
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "agents_id",referencedColumnName = "id")
//    private Agents agents;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Date getDateConclusion() {
        return dateConclusion;
    }

    public void setDateConclusion(Date dateConclusion) {
        this.dateConclusion = dateConclusion;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double getPremium() {
        return premium;
    }

    public void setPremium(double premium) {
        this.premium = premium;
    }

    public Set<InsuredPerson> getInsuredPerson() {
        return insuredPerson;
    }

    public void setInsuredPerson(Set<InsuredPerson> insuredPerson) {
        this.insuredPerson = insuredPerson;
    }

    public Individual getIndividual() {
        return individual;
    }

    public void setIndividual(Individual individual) {
        this.individual = individual;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }
}
