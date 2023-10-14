package main.java.Pesquisa;

import java.util.Objects;

public class Tarefa {
    private String descricao;
    private boolean concluido;

    public Tarefa(String descricao){
        this.descricao = descricao;
        this.concluido = false;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public boolean getConcluido(){
        return this.concluido;
    }

    public void setConcluido(boolean b){
        this.concluido = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarefa tarefa)) return false;
        return Objects.equals(getDescricao(), tarefa.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescricao());
    }

    public String toString(){
        return "Tarefa: " + descricao + " - concluído: " + concluido;
    }
}
