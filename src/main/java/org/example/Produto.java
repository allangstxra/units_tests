package org.example;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void aplicaDesconto(double porcentagem) {
        if (porcentagem > 0 && porcentagem <= 100) {
            this.preco -= this.preco * (porcentagem / 100);
        }
    }

    public boolean precisaReposicao() {
        return this.quantidade < 5;
    }
    
    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}