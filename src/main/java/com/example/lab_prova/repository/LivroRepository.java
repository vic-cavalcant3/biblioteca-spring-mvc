package com.example.lab_prova.repository;

import com.example.lab_prova.model.Livro;
import com.example.lab_prova.model.StatusLivro;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class LivroRepository {

    private final List<Livro> livros = new ArrayList<>();
    private Long contador = 1L;

    public List<Livro> listarTodos() {
        return livros;
    }

    public void salvar(Livro livro) {
        livro.setId(contador++);
        livros.add(livro);
    }

    public Optional<Livro> buscarPorId(Long id) {
        return livros.stream()
                .filter(l -> l.getId().equals(id))
                .findFirst();
    }

    public List<Livro> listarDisponiveis() {
        return livros.stream()
                .filter(l -> l.getStatus() == StatusLivro.DISPONIVEL)
                .toList();
    }
}