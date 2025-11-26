package com.orientacao_objeto.modulo02;

public class ContaBancaria {
    // Atributos PRIVADOS
    private String titular;
    private String numeroConta;
    private double saldo;

    // Construtor
    public ContaBancaria(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    // Getters
    public String getTitular() {
        return titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    // Setter do titular (com validação)
    public void setTitular(String titular) {
        if (titular == null || titular.trim().isEmpty()) {
            System.out.println("Titular não pode ser vazio!");
            return;
        }
        this.titular = titular;
    }

    // NÃO tem setter para saldo!
    // Saldo só muda através de depositar() e sacar()

    // Métodos de negócio
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado: R$ " + valor);
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido!");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= valor;
            System.out.println("Saque realizado: R$ " + valor);
        }
    }
}