package main.java.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> listaDeTarefas;

    public ListaTarefa(){
        this.listaDeTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        listaDeTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t: listaDeTarefas){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        listaDeTarefas.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return listaDeTarefas.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(listaDeTarefas);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O número de tarefas é " + listaTarefa.obterNumeroTotalTarefas());

        // listaTarefa.adicionarTarefa("tarefa 1");
        // listaTarefa.adicionarTarefa("tarefa 2");
        System.out.println("O número de tarefas é " + listaTarefa.obterNumeroTotalTarefas());
        
        // listaTarefa.removerTarefa("tarefa 2");
        // System.out.println("O número de tarefas é " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricoesTarefas();
    }
}
