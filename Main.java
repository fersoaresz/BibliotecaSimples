package livraria;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Adicionando livros
        biblioteca.adicionarLivro("O Senhor dos Anéis", "J.R.R. Tolkien");
        biblioteca.adicionarLivro("O Hobbit", "J.R.R. Tolkien");
        biblioteca.adicionarLivro("1984", "George Orwell");

        // Listando todos os livros
        System.out.println("Todos os livros:");
        List<Livro> todosOsLivros = biblioteca.listarLivros();
        for (Livro livro : todosOsLivros) {
            System.out.println(livro.getTitulo() + " - " + livro.getAutor());
        }

        // Buscando livros por autor
        System.out.println("\nLivros de Tolkien:");
        List<Livro> livrosTolkien = biblioteca.buscarPorAutor("j.r.r. tolkien");
        for (Livro livro : livrosTolkien) {
            System.out.println(livro.getTitulo());
        }

        // Buscando livro por ISBN (deve retornar null, pois ISBNs estão vazios)
        System.out.println("\nBuscando livro por ISBN (vazio):");
        Livro livroPorIsbn = biblioteca.buscarPorIsbn("");
        if (livroPorIsbn != null) {
            System.out.println("Encontrado: " + livroPorIsbn.getTitulo());
        } else {
            System.out.println("Livro não encontrado.");
        }
    }
}