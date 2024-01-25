package com.example.springproj.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
public class Foyer implements Serializable {
    @Id
    @Column(name="idFoyer")
    private String idFoyer; // Clé primaire
    private  String nomFoyer;
    private  Long capaciteFoyer;

    @OneToOne(mappedBy = "foyer")
    private  Universite universite;

    @OneToMany(mappedBy = "foyer")
    private List<Bloc> bloc;
}
