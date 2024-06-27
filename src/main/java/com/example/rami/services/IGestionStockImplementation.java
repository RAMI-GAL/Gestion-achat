package com.example.rami.services;


import com.example.rami.entities.GestionStock;

import com.example.rami.repositories.GestionStockRepository;



public class IGestionStockImplementation {
    GestionStockRepository gestionStockRepository;

    public IGestionStockImplementation(GestionStockRepository gestionStockRepository){
        this.gestionStockRepository=gestionStockRepository;
    }

    public GestionStock saveGestionStock(GestionStock gestionStock) {
        return gestionStockRepository.save(gestionStock);
    }
}

