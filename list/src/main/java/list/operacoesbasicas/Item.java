package main.java.list.operacoesbasicas;

public class Item {
    private String nome;
    private double preco;
    private int quantidade;

    public Item(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getQuantidade(){
        return quantidade;
    }

    // public double calcularPreco(double preco, int quantidade){
    //     System.out.println("O preço é: " + preco + " e a quantidade é " + quantidade);
    //     return preco * quantidade;
    // }

    // @@Override
	public String toString() {
		return "Item{" +
				"nome='" + nome + '\'' +
				", preco=" + preco +
				", quant=" + quantidade +
				'}';
	}
}