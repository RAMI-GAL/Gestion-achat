package com.example.rami.services;

import com.example.rami.entities.Fournisseur;
import com.example.rami.repositories.FournisseurRepository;
public class IFournisseurImplementation {

    FournisseurRepository fournisseurRepository;

    public IFournisseurImplementation(FournisseurRepository fournisseurRepository){
        this.fournisseurRepository=fournisseurRepository;
    }

public Fournisseur saveFournisseur(Fournisseur fournisseur) {
       return fournisseurRepository.save(fournisseur);
    }
}
