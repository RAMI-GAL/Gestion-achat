package com.example.rami.repositories;

import com.example.rami.entities.HistoriqueCommande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoriqueCommandeReporitory extends JpaRepository<HistoriqueCommande, Integer> {
}
