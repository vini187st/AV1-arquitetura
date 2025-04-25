package com.example.projetocrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projetocrud.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
