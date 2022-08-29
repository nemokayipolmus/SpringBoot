package com.example.bidirectional_withjointable.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.repository.NoRepositoryBean;

import javax.persistence.*;
import java.util.List;

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

    @ManyToOne(targetEntity = Person.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "person_vehicle",
            joinColumns = {
                    @JoinColumn(name = "vehicle_id", referencedColumnName = "id")},
            inverseJoinColumns = {
                    @JoinColumn(name = "person_id", referencedColumnName = "id")}
    )
    private Person person;


}
