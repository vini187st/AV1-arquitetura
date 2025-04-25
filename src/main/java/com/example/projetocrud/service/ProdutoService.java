package com.example.projetocrud.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projetocrud.model.Produto;
import com.example.projetocrud.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto criar(Produto produto) {
        return produtoRepository.save(produto);
    }

    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    public Optional<Produto> buscarPorId(Long id) {
        return produtoRepository.findById(id);
    }

    public Optional<Produto> atualizar(Long id, Produto novoProduto) {
        return produtoRepository.findById(id).map(produto -> {
            produto.setNome(novoProduto.getNome());
            produto.setPreco(novoProduto.getPreco());
            produto.setDescricao(novoProduto.getDescricao());
            produto.setCategoria(novoProduto.getCategoria());
            return produtoRepository.save(produto);
        });
    }

    public boolean deletar(Long id) {
        if (produtoRepository.existsById(id)) {
            produtoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
