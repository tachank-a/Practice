package com.example.finalproject.entity;


import com.example.finalproject.entity.Customer;
//import com.example.finalproject.entity.insured.InsuredPersons;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "CONTRACTS")
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "contract_number")
    private long contractNumber;

    @Column(name = "ds")
    private Date dateStart;

    @Column(name = "de")
    private Date dateEnd;

    @Column(name = "dc")
    private Date dateConclusion;

    @Column(name = "sum")
    private double sum;

    @Column(name = "premium")
    private double premium;

//    @GeneratedValue
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "agents_id",referencedColumnName = "id")
//    private Agents agents;

    @OneToMany(mappedBy = "contract", fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Set<InsuredPerson> insuredPerson;



    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id",referencedColumnName = "id")
    private Customer customers;




    public Contract(long contractNumber, Date dateStart, Date dateEnd, Date dateConclusion, double sum, double premium) {
        this.contractNumber = contractNumber;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.dateConclusion = dateConclusion;
        this.sum = sum;
        this.premium = premium;
    }

    public Contract() {

    }

    public long getId() {
        return id;
    }

    public long getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(long contractNumber) {
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

    @Override
    public String toString() {
        return "Contract{" +
                "id=" + id +
                ", contractNumber=" + contractNumber +
                ", dateStart=" + dateStart +
                ", dateEnd=" + dateEnd +
                ", dateConclusion=" + dateConclusion +
                ", sum=" + sum +
                ", premium=" + premium +
                '}';
    }
}