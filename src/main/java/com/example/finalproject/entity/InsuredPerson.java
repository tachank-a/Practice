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

    @ManyToMany
    @JoinTable(name = "insured_persons_options",
            joinColumns = @JoinColumn(name = "insured_person_id",
                    referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "option_id", referencedColumnName = "id"))
    private Set<Option> options;


    public InsuredPerson(String fullName, Date dob, Contract contract, Set<Option> options) {
        this.fullName = fullName;
        this.dob = dob;
        this.contract = contract;
        this.options = options;
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
}
