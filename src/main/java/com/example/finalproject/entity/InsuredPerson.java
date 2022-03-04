package com.example.finalproject.entity;

import javax.persistence.*;
import java.sql.Date;

import java.util.Set;


@Entity
@Table(name = "INSURED_PERSONS")
public class InsuredPerson {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "date_of_birth")
    private Date dob;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "contract_id", nullable = false)
    private Contract contract;




    public InsuredPerson(String fullName, Date dob, Contract contract) {
        this.fullName = fullName;
        this.dob = dob;
        this.contract = contract;
    }

    protected InsuredPerson() {

    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }
}
