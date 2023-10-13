package main.java.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinho;

    public CarrinhoDeCompras(){
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item i = new Item(nome, preco, quantidade);
        carrinho.add(i);
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item i: carrinho){
            if(i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        carrinho.removeAll(itensParaRemover);
    }

    public double calcularValorTotal(){
        double totalCarrinho = 0d;
        for(Item i: carrinho){
            double valorItem = i.getPreco() * i.getQuantidade();
            totalCarrinho += valorItem;
        }

        return totalCarrinho;
    }

    public void exibirItens(){
        System.out.println(carrinho);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras compra1 = new CarrinhoDeCompras();
        
        compra1.adicionarItem("banana", 5.50, 3);
        compra1.adicionarItem("maçã", 2.75, 4);

        compra1.exibirItens();

        compra1.removerItem("banana");
        compra1.exibirItens();

        System.out.println("O valor do carrinho é " + compra1.calcularValorTotal());
    }
}
