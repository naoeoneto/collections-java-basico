package main.java.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numeros;

    public OrdenacaoNumeros(){
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numAscOrdem = new ArrayList<>(this.numeros);
        Collections.sort(numAscOrdem);

        return numAscOrdem;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numDescOrdem = new ArrayList<>(numeros);
        numDescOrdem.sort(Collections.reverseOrder());

        return numDescOrdem;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros onn = new OrdenacaoNumeros();

        onn.adicionarNumero(6);
        onn.adicionarNumero(3);
        onn.adicionarNumero(33);
        onn.adicionarNumero(19);
        onn.adicionarNumero(25);
        onn.adicionarNumero(-2);

        System.out.println(onn.ordenarAscendente());
        System.out.println(onn.ordenarDescendente());
    }
}
