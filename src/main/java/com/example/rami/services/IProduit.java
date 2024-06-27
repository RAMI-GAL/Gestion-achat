package com.example.rami.services;

import com.example.rami.Dao.ProduitDao;
import com.example.rami.entities.Produit;

public interface IProduit {
    Produit saveProduit(Produit produit);


    ProduitDao createProduit(ProduitDao produitDao);

}
