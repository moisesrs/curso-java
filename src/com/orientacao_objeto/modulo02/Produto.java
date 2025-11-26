package com.orientacao_objeto.modulo02;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    // Setter do nome
    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Nome não pode ser vazio!");
            return;
        }
        this.nome = nome;
    }

    // Setter do preço COM VALIDAÇÃO
    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("Preço não pode ser negativo!");
            return;
        }
        this.preco = preco;
    }

    // Setter da quantidade COM VALIDAÇÃO
    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            System.out.println("Quantidade não pode ser negativa!");
            return;
        }
        this.quantidade = quantidade;
    }

    // Getters
    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getQuantidade() { return quantidade; }
}