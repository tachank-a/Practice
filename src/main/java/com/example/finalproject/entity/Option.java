package com.example.finalproject.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "OPTIONS")
public class Option {
    @Id
    @GeneratedValue
    private long id;

    private String name;

    @ManyToMany(mappedBy = "options")
    private Set<InsuredPerson> insuredPerson;
}
