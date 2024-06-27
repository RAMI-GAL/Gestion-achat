package com.example.rami.services;

import com.example.rami.entities.Produit;
import com.example.rami.repositories.ProduitRepository;

public class IProduitImplementation implements IProduit{
    ProduitRepository produitRepository;

    public IProduitImplementation(ProduitRepository produitRepository){
        this.produitRepository=produitRepository;
    }
    @Override
    public Produit saveProduit(Produit produit) {
        return produitRepository.save(produit);
    }
}
