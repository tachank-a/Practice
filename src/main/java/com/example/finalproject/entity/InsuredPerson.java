package com.example.finalproject.entity;

import javax.persistence.*;
import java.sql.Date;

import java.util.Set;


@Entity
@Table(name = "INSURED_PERSONS")
public class InsuredPerson {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


   // private Set<Options> options;
    private String fullName;
    private Date dob;

    public InsuredPerson() {}



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
