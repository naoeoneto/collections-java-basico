package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros(){
        this.numeros = new ArrayList<>();
    }
    
    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for (Integer n: numeros){
            soma +=n;
        }

        return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNum = 0;
        for (Integer n : numeros) {
            if(n > maiorNum){
                maiorNum = n;
            }
        }

        return maiorNum;
    }

    public int encontrarMenorNumero(){
        int menorNum = 100000;
        for (Integer n : numeros) {
            if(n < menorNum){
                menorNum = n;
            }
        }

        return menorNum;
    }

    public void exibirNumeros(){
        if (!numeros.isEmpty()) {
            System.out.println(this.numeros);
          } else {
            System.out.println("A lista está vazia!");
          }
    }

    public static void main(String[] args) {
        SomaNumeros meusNumeros = new SomaNumeros();

        meusNumeros.adicionarNumero(5);
        meusNumeros.adicionarNumero(17);
        meusNumeros.adicionarNumero(-15);
        meusNumeros.adicionarNumero(7);

        meusNumeros.exibirNumeros();

        System.out.println("Soma dos números = " + meusNumeros.calcularSoma());

        System.out.println("Maior número = " + meusNumeros.encontrarMaiorNumero());

        System.out.println("Menor número = " + meusNumeros.encontrarMenorNumero());

    }
}
