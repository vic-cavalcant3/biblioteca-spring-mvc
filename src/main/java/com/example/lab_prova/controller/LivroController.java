package com.example.lab_prova.controller;

import com.example.lab_prova.model.Categoria;
import com.example.lab_prova.model.Livro;
import com.example.lab_prova.repository.LivroRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/livros")
public class LivroController {

    private final LivroRepository repository;

    public LivroController(LivroRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("livros", repository.listarTodos());
        return "livros/lista";
    }

    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("livro", new Livro());
        model.addAttribute("categorias", Categoria.values());
        return "livros/formulario";
    }

    @PostMapping
    public String salvar(@Valid @ModelAttribute("livro") Livro livro,
                         BindingResult result,
                         Model model) {

        if (result.hasErrors()) {
            model.addAttribute("categorias", Categoria.values());
            return "livros/formulario";
        }

        repository.salvar(livro);
        return "redirect:/livros";
    }
}