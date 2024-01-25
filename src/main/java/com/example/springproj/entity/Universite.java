package com.example.springproj.entity;

import jakarta.persistence.*;

@Entity
public class Universite {
    @Id
    private Long idUniversite; // Clé primaire
    private  String nomUniversite;
    private  String adresse;

    @OneToOne
    private Foyer foyer;
}
