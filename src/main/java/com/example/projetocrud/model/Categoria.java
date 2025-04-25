package com.example.projetocrud.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.*;
import lombok.*;

@EntityScan("com.example.projetocrud.model")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
}