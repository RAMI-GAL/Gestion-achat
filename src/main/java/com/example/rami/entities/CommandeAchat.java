package com.example.rami.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data @NoArgsConstructor
@AllArgsConstructor @Builder
public class CommandeAchat {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn()
    private Fournisseur idFournisseur;
    private Date DateCommande;
    @ManyToOne
    private List<Produit> Article;
    private String status;
    private float montantTotal;
}
