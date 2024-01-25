package com.example.springproj.entity;

import com.example.springproj.repository.EtudiantRepos;
import com.example.springproj.service.IEtudiantService;


import java.util.List;
import java.util.Set;

public class EtudiantService implements IEtudiantService {

    EtudiantRepos er;
    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return (List<Etudiant>) er.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return er.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return er.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(Long idEtudiant) {
        return er.findById(idEtudiant).orElse(null);
    }

    @Override
    public void removeEtudiant(Long idEtudiant) {
    er.deleteById(idEtudiant);
    }

    @Override
    public List<Etudiant> addEtudiants(List<Etudiant> etudiants) {
        return (List<Etudiant>) er.saveAll(etudiants);
    }
}
