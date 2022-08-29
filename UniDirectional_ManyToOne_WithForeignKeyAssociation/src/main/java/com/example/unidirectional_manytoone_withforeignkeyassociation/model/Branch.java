package com.example.unidirectional_manytoone_withforeignkeyassociation.model;

import javax.persistence.*;

@Entity
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer branchId;

    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    private Company company;

}
