package com.example.rami.services;

import com.example.rami.entities.HistoriqueCommande;
import com.example.rami.repositories.HistoriqueCommandeReporitory;

public class IHistoriqueCommandeImplementation {
    HistoriqueCommandeReporitory historiqueCommandeReporitory;

    public IHistoriqueCommandeImplementation(HistoriqueCommandeReporitory historiqueCommandeRepository){
        this.historiqueCommandeReporitory=historiqueCommandeRepository;
    }

    public HistoriqueCommande saveHistoriqueCommande(HistoriqueCommande historiqueCommande) {
        return historiqueCommandeReporitory.save(historiqueCommande);
    }
}

