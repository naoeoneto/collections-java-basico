package main.java.Ordenacao;

public class Livro {
    private String titulo;
    private String autor; 
    protected double preco;

    public Livro(String titulo, String autor, double preco){
        this.titulo = titulo;
        this.autor  = autor;
        this.preco = preco;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public double getPreco(){
        return this.preco;
    }

    public String toString(){
        return "Livro: " + titulo + " - " + autor + ", preço: " + preco;
    }
}
