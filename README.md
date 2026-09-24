# 📚 Biblioteca Spring MVC – Laboratório de Spring Boot

Sistema web simples para cadastro e controle de livros de uma biblioteca, desenvolvido como laboratório preparatório para a prova de Java. Os dados são armazenados **em memória**, sem banco de dados.

---

## 📚 Objetivo do Projeto

Praticar o fluxo **Spring MVC** (Controller → Model → View), validação de formulários com **Bean Validation** e modelagem orientada a objetos, mantendo as regras de negócio no domínio.

---

## 🗺️ Funcionalidades

* Cadastrar livros com validação dos campos
* Listar todos os livros
* Visualizar detalhes de um livro
* Emprestar e devolver livros (regra de negócio na entidade)
* Listar somente livros disponíveis

---

## 🗂️ Estrutura

* **model** → `Livro`, `Categoria` e `StatusLivro`
* **repository** → `LivroRepository`, armazenamento em `List`
* **controller** → `LivroController`, rotas `/livros`
* **templates/livros** → `lista.html`, `formulario.html` e `detalhes.html`

---

## 🛠️ Tecnologias Utilizadas

* **Java 21**
* **Spring Boot** (Spring Web MVC)
* **Thymeleaf**
* **Bean Validation** (`@Valid`, `BindingResult`)
* **Lombok**
* **Maven**

---

## 🌐 Como Rodar o Projeto

1. Clone o repositório e abra no IntelliJ
2. Aguarde o Maven baixar as dependências
3. Execute a classe `LabProvaApplication`
4. Acesse `http://localhost:8080/livros`

> ⚠️ Como os dados ficam em memória, todos os livros são apagados ao reiniciar a aplicação.

---

## 🎓 Contexto Acadêmico

Laboratório da disciplina de Java do curso **Tecnólogo em Análise e Desenvolvimento de Sistemas** (SENAI).

---

## 🚀 Status do Projeto

🟡 Em desenvolvimento
