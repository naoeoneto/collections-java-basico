package main.java.Ordenacao;

import java.util.Comparator;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private Long matricula;
    private double media;

    public Aluno(String nome, Long matricula, double media){
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    public String getNome(){
        return this.nome;
    }

    public Long getMatricula(){
        return this.matricula;
    }

    public double getMedia(){
        return this.media;
    }

    public String toString(){
        return "Aluno { nome: " + nome + " - Matrícula: " + matricula + " - Média: " + media + " }";
    }

    @Override
    public int compareTo(Aluno a) {
        return nome.compareToIgnoreCase(a.getNome());
    }
}

class ComparatorPorNota implements Comparator<Aluno>{

    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getMedia(), a2.getMedia());
    }}