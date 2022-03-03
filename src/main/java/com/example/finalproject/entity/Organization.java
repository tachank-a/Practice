package com.example.finalproject.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "ORGANIZATIONS")
public class Organization extends Customer{

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "date_of_registration")
    private Date dor;

    public Organization() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public Date getDor() {
        return dor;
    }

    public void setDor(Date dor) {
        this.dor = dor;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "fullName='" + fullName + '\'' +
                ", dor=" + dor +
                '}';
    }
}
