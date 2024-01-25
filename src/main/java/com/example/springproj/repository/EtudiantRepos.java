package com.example.springproj.repository;

import com.example.springproj.entity.Etudiant;
import org.springframework.data.repository.CrudRepository;

public interface EtudiantRepos extends CrudRepository <Etudiant,Long> {
    
}
