package com.example.manytomany.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "certificate")
public class Certificate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    @ManyToMany(targetEntity = Company.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
        @JoinTable(
                name = "company_certifica",
                joinColumns ={ @JoinColumn(name = "certificate_id",referencedColumnName = "id")},
                inverseJoinColumns ={@JoinColumn(name = "company_id",referencedColumnName = "id")}
        )
    private Set<Company> company = new HashSet<>(); //There should be same name with mappedBy name of Company class
}
