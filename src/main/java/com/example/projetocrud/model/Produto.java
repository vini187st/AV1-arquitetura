package com.example.projetocrud.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.*;
import lombok.*;

@EntityScan("com.example.projetocrud.model")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private Double preco;
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;
}