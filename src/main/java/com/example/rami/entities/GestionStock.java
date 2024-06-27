package com.example.rami.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor
@AllArgsConstructor @Builder
public class GestionStock {
    @ManyToMany
    private Long idProduit;
    private int quantite;
    private int seuilAlerte;
}
