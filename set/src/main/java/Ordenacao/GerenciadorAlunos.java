package main.java.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> lista;

    public GerenciadorAlunos(){
        this.lista = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        lista.add(new Aluno(nome, matricula, media));
    }

    public void removerAlunoPorMatricula(long matricula) {
        Aluno alunoRemovido = null;

        for (Aluno a: lista){
            if(a.getMatricula() == matricula){
                alunoRemovido = a;
                break;
            }
        }

        lista.remove(alunoRemovido);
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> listaExibicao = new TreeSet<>(lista);        
        return listaExibicao;
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> listaExibicao = new TreeSet<>(new ComparatorPorNota());
        listaExibicao.addAll(lista);
        return listaExibicao;
    }

    public void exibirAlunos(){
        System.out.println(lista);
    }

    public static void main(String[] args) {
        // Criando uma instância do GerenciadorAlunos
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        // gerenciadorAlunos.exibirAlunos();

        // Adicionando alunos ao gerenciador
        gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
        gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
        gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
        gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

        // Exibindo todos os alunos no gerenciador
        System.out.println("Alunos no gerenciador:");
        gerenciadorAlunos.exibirAlunos();

        // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
        gerenciadorAlunos.removerAlunoPorMatricula(000L);
        // gerenciadorAlunos.exibirAlunos();
        gerenciadorAlunos.removerAlunoPorMatricula(123457L);
        // gerenciadorAlunos.exibirAlunos();

        // Exibindo alunos ordenados por nome
        // System.out.println(gerenciadorAlunos.exibirAlunosPorNome());

        // // Exibindo alunos ordenados por nota
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
    }
}
