package com.example.springproj.entity;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table( name = "Etudiant")
public class Etudiant  implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idEtudiant")
    private Long idEtudiant; // Clé primaire
    private String nomEt;
    private String prenomEt;
    private Long cin;
    private String ecole;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    @ManyToMany
    private List<Reservation> reservation;
}


