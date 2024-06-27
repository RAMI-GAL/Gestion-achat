package com.example.rami.services;


import com.example.rami.entities.Utilisateur;
import com.example.rami.repositories.UtilisateurRepository;

public class IUtilisateurImplementation {

    UtilisateurRepository utilisateurRepository;

    public IUtilisateurImplementation(UtilisateurRepository utilisateurRepository){
        this.utilisateurRepository=utilisateurRepository;
    }

    public Utilisateur saveUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }
}

