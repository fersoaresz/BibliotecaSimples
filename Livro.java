package livraria;

public class Livro {
    private String isbn;
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.isbn = gerarIsbn(); // Gera um ISBN fictício
        this.titulo = titulo;
        this.autor = autor;
    }

    private String gerarIsbn() {
        // Exemplo simples de geração automática de ISBN (fictício)
        return "ISBN-" + System.currentTimeMillis();
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }
}