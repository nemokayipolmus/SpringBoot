package com.example.unidirectional_manytoone_withjointable.model;

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
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
        @JoinTable(name = "vehicle_person",
    joinColumns = {
            @JoinColumn(name = "vehicle_id", referencedColumnName = "id")},
    inverseJoinColumns={
            @JoinColumn(name = "person_id",referencedColumnName = "id")
    })
    private Person person;

    public Vehicle(String name) {
        this.name = name;
    }
}
