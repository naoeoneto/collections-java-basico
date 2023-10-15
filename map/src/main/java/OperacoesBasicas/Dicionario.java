package main.java.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dic;

    public Dicionario(){
        this.dic = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        this.dic.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dic.isEmpty()){
            this.dic.remove(palavra);
        } else {
            System.out.println("Palavra não encontrada");
        }
    }

    public void exibirPalavras(){
        System.out.println(dic);
    }

    public String pesquisarPorPalavra(String palavra){
        String descricao = dic.get(palavra);            
            if(descricao != null){
                return descricao;
            } 
        return "Palavra e/ou descrição não existem";
    }

    public static void main(String[] args) {
        Dicionario novoDicionario = new Dicionario();

        novoDicionario.adicionarPalavra("Porta", "Algo que abre e fecha");
        novoDicionario.adicionarPalavra("Pé", "Parte do corpo");
        novoDicionario.adicionarPalavra("Livro", "Serve para estudar");
        novoDicionario.adicionarPalavra("Copo", "Utilizado para beber líquidos");

        novoDicionario.removerPalavra("Porta");
        // novoDicionario.exibirPalavras();

        System.out.println(novoDicionario.pesquisarPorPalavra("Copo"));
        System.out.println(novoDicionario.pesquisarPorPalavra("Porta"));
    }
}
