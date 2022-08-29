package com.example.bidirectional_withjointable.model;

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
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    @OneToMany(targetEntity = Vehicle.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "person")
    private List<Vehicle> vehicles = new ArrayList<>();


}
