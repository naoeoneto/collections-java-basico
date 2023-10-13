package main.java.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> listaDePessoas;

    public OrdenacaoPessoas(){
        this.listaDePessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        listaDePessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listaDePessoas);
        Collections.sort(pessoasPorIdade);

        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listaDePessoas);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());

        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ord = new OrdenacaoPessoas();
        ord.adicionarPessoa("pessoa 01", 27, 1.80);
        ord.adicionarPessoa("pessoa 02", 23, 1.70);
        ord.adicionarPessoa("pessoa 03", 25, 1.85);
        ord.adicionarPessoa("pessoa 04", 19, 1.67);

        System.out.println(ord.ordenarPorIdade());
        System.out.println(ord.ordenarPorAltura());
    }
}
