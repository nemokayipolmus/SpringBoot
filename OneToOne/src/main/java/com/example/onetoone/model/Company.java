package com.example.onetoone.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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

    //@OneToOne //with no args there are one foreign key in Ceo table (company_id) and one foreign key in Company table (ceo_id). And this is not recommended because too much coupling for sure

    /*
    @OneToOne(targetEntity = Ceo.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "ceo_id", referencedColumnName = "id") // Unidirectional - owner is company bcs @JoinColumn
     */

    @OneToOne(targetEntity = Ceo.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "ceo_name",referencedColumnName = "name")
    private Ceo ceo;




}
