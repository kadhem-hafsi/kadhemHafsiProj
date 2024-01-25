package com.example.springproj.entity;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table( name = "Reservation")
public class Reservation implements Serializable {
    @Id
    @Column(name="idReservation")
    private String idReservation; // Clé primaire
    private Date anneeUniversitaire;
    private boolean estValidate;

    @ManyToMany(mappedBy = "reservation")
    private List<Etudiant> etudiant;
}
