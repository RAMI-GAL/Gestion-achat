package com.example.rami.repositories;

import com.example.rami.entities.GestionStock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GestionStockRepository extends JpaRepository<GestionStock, Integer> {
}
