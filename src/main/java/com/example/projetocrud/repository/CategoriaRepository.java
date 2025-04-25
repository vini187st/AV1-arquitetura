package com.example.projetocrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projetocrud.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
