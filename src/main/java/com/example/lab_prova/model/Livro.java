package com.example.lab_prova.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Livro {

    private Long id;

    @NotBlank(message = "Informe o título")
    @Size(min = 3, max = 100, message = "...") /*O TITULO TEM QUE TER ENTRE 3 A 100 CARACTERES*/
    private String titulo;

    @NotBlank(message = "Informe o autor")
    private String autor;

    @NotBlank(message = "Informe o ISBN")
    @Size(min = 10, max = 13, message = "O ISBN deve ter entre 10 e 13 caracteres")
    private String isbn;

    @NotNull(message = "Informe o ano de publicação")
    @Min(value = 1450, message = "Ano inválido")
    private String anoPublicacao;

    @NotNull(message = "Selecione a categoria")
    private Categoria categoria;
    private StatusLivro status;

    public Livro() {

        this.status = StatusLivro.DISPONIVEL;
    }
}
