package com.example.springproj.entity;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Chambre {
    @Id
    private Long idChambre; // Clé primaire
    private  Long numeroChambre;

    @Enumerated(EnumType.STRING)
    private  TypeChambre TypeChambre;

    @ManyToOne
    private Bloc bloc;


    @OneToMany
    private List<Reservation> reservation;

}
