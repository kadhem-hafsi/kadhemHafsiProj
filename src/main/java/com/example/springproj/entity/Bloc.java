package com.example.springproj.entity;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;



@Entity
@Table( name = "Bloc")
public class Bloc implements Serializable {
    @Id
    @Column(name="idBloc")
    private long idBloc;
    private String nomBloc;
    private long capaciteBloc;

    @ManyToOne
    private Foyer foyer;

    @OneToMany(mappedBy = "bloc")
    private List<Chambre> chambre;

}
