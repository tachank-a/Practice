package com.example.finalproject.entity;

import javax.persistence.*;

@Entity
@Table(name = "CUSTOMERS")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Customer {

    @Id
    @GeneratedValue
    protected long id;

    protected String address;
    protected String phone;

    public Customer() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
