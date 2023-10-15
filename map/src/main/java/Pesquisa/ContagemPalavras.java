package main.java.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> lista;

    public ContagemPalavras(){
        this.lista = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        this.lista.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if(!lista.isEmpty()){
            for(Map.Entry<String, Integer> p : lista.entrySet()){
                if(p.getKey().equalsIgnoreCase(palavra)){
                    lista.remove(p.getKey(), p.getValue());
                    break;
                }
            }
        } else {
            System.out.println("Não existem palavras aqui");
        }
    }

    public int exibirContagemPalavras(){
        int contador = 0;
        for (int contagem: lista.values()){
            contador += contagem;
        }
        return contador;
    }

    public void encontrarPalavraMaisFrequente(){
        int frequencia = Integer.MIN_VALUE;
        String palavraMaiorFrequencia = "";

        if(!lista.isEmpty()){
            for(Map.Entry<String, Integer> p : lista.entrySet()){
                if(p.getValue() > frequencia){
                    frequencia = p.getValue();
                    palavraMaiorFrequencia = p.getKey();
                }
            }
        }

        System.out.println("A palavra com maior frequência é: " + palavraMaiorFrequencia);
        System.out.println("Ela apareceu " + frequencia + " vezes");
    }

    public static void main(String[] args) {
        ContagemPalavras cp = new ContagemPalavras();

        cp.adicionarPalavra("Mão", 12);
        cp.adicionarPalavra("Justa", 7);
        cp.adicionarPalavra("Doce", 13);
        cp.adicionarPalavra("Linda", 9);
        
        cp.removerPalavra("linda");
        System.out.println("Existem " + cp.exibirContagemPalavras() + " palavras");

        cp.encontrarPalavraMaisFrequente();
    }
}
