package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> catalogo;

    public CatalogoLivros(){
        this.catalogo = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        Livro livro = new Livro(titulo, autor, anoPublicacao);
        catalogo.add(livro);
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();

        // método 'isEmpty' retorna um booleano
        if(!catalogo.isEmpty()){
            for(Livro l: catalogo){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }

        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosNoIntervalo = new ArrayList<>();
        if(!catalogo.isEmpty()){
            for(Livro l: catalogo){
                if(l.getAno() >= anoInicial && l.getAno() <= anoFinal){
                    livrosNoIntervalo.add(l);
                }
            }
        }
        return livrosNoIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        for (Livro l : catalogo) {
            if(l.getTitulo().equalsIgnoreCase(titulo)){
                livroPorTitulo = l;
                break;
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros livros = new CatalogoLivros();

        livros.adicionarLivro("Livro 01", "Autor 01", 2016);
        livros.adicionarLivro("Livro 02", "Autor 02", 2015);
        livros.adicionarLivro("Livro 03", "Autor 01", 2019);
        livros.adicionarLivro("Livro 01", "Autor 02", 2013);

        System.out.println(livros.pesquisarPorAutor("Autor 02"));
        System.out.println(livros.pesquisarPorIntervaloAnos(2017, 2020));
        System.out.println(livros.pesquisarPorTitulo("Livro 01"));
    }
}
