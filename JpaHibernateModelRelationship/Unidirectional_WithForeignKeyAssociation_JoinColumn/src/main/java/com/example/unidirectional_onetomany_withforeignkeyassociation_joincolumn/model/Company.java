package com.example.unidirectional_onetomany_withforeignkeyassociation_joincolumn.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    @OneToMany(targetEntity = Branch.class,cascade = CascadeType.ALL,
                fetch = FetchType.LAZY,orphanRemoval = true)
    @JoinColumn(name = "companyId",referencedColumnName = "id")
    private List<Branch> branches = new ArrayList<>();



}
