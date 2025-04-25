package com.example.projetocrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projetocrud.model.Categoria;
import com.example.projetocrud.repository.CategoriaRepository;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria criar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public List<Categoria> listarTodas() {
        return categoriaRepository.findAll();
    }

    public Optional<Categoria> buscarPorId(Long id) {
        return categoriaRepository.findById(id);
    }

    public Optional<Categoria> atualizar(Long id, Categoria novaCategoria) {
        return categoriaRepository.findById(id).map(categoria -> {
            categoria.setNome(novaCategoria.getNome());
            categoria.setDescricao(novaCategoria.getDescricao());
            return categoriaRepository.save(categoria);
        });
    }

    public boolean deletar(Long id) {
        if (categoriaRepository.existsById(id)) {
            categoriaRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
