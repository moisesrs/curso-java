package com.orientacao_objeto.modulo01;

public class TesteConta {
    public static void main(String[] args) {
        // Criando uma conta
        ContaBancaria conta = new ContaBancaria("João Silva", "12345-6");

        // Usando os métodos
        conta.exibirInfo();
        conta.depositar(1000.00);
        conta.sacar(300.00);
        conta.exibirInfo();

        double saldoAtual = conta.consultarSaldo();
        System.out.println("Saldo final: R$ " + saldoAtual);
    }
}