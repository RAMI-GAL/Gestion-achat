package com.example.rami.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter@Setter
@NoArgsConstructor

public class Article {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
}
