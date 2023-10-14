package main.java.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> conjunto;

    public ConjuntoPalavrasUnicas(){
        this.conjunto = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        this.conjunto.add(palavra);
    }

    public void removerPalavra(String palavra){
        String palavraParaRemover = null;
        for(String p: conjunto){
            if(p.equalsIgnoreCase(palavra)){
                palavraParaRemover = p;
            }
        }
        conjunto.remove(palavraParaRemover);
    }

    public void verificarPalavra(String palavra){
        System.out.println("Verificando se a palavra " + palavra + " está no conjuto");
        if(this.conjunto.contains(palavra)){
            System.out.println("A palavra " + palavra + " está no conjunto");
        } else {
            System.out.println("A palavra " + palavra + " não está no conjunto");
        }
    }

    // public boolean verificarPalavra(String palavra) {
    //     return conjunto.contains(palavra);
    //  }

    public void exibirPalavrasUnicas(){
        System.out.println(conjunto);
    }


    public static void main(String[] args) {
         // Criando uma instância da classe ConjuntoPalavrasUnicas
    ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

    // Adicionando linguagens únicas ao conjunto
    conjuntoLinguagens.adicionarPalavra("Java");
    conjuntoLinguagens.adicionarPalavra("Python");
    conjuntoLinguagens.adicionarPalavra("JavaScript");
    conjuntoLinguagens.adicionarPalavra("Python");
    conjuntoLinguagens.adicionarPalavra("C++");
    conjuntoLinguagens.adicionarPalavra("Ruby");

    // Exibindo as linguagens únicas no conjunto
    conjuntoLinguagens.exibirPalavrasUnicas();

    // Removendo uma linguagem do conjunto
    conjuntoLinguagens.removerPalavra("Python");
    conjuntoLinguagens.exibirPalavrasUnicas();

    // Removendo uma linguagem inexistente
    conjuntoLinguagens.removerPalavra("Swift");

    // Verificando se uma linguagem está no conjunto
    System.out.println("A linguagem 'Java' está no conjunto? ");
    conjuntoLinguagens.verificarPalavra("Java");
    System.out.println();
    System.out.println("A linguagem 'Python' está no conjunto? ");
    conjuntoLinguagens.verificarPalavra("Python");

    // // Outra alternativa 
    // System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
    // System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));

    // Exibindo as linguagens únicas atualizadas no conjunto
    conjuntoLinguagens.exibirPalavrasUnicas();
    }
}
