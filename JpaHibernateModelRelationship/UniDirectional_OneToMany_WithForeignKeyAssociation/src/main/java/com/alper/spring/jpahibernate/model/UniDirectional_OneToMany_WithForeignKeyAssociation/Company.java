package com.alper.spring.jpahibernate.model.UniDirectional_OneToMany_WithForeignKeyAssociation;

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
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @OneToMany(targetEntity = Branch.class,cascade = CascadeType.ALL,
                fetch = FetchType.LAZY,orphanRemoval = true)
    private List<Branch> branch = new ArrayList<>();

}
