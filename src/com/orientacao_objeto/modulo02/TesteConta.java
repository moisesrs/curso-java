package com.orientacao_objeto.modulo02;

public class TesteConta {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Maria Silva", "98765-4");

        // ✅ Métodos públicos controlam tudo
        conta.depositar(1000.00);
        conta.sacar(300.00);

        // ✅ Pode ler o saldo
        System.out.println("Saldo: R$ " + conta.getSaldo());

        // ❌ NÃO pode alterar saldo diretamente
        // conta.saldo = 999999.99;  // ERRO! saldo é private

        // ❌ Validação funciona
        conta.depositar(-50.00);   // Valor de depósito inválido!
        conta.sacar(10000.00);     // Saldo insuficiente!
    }
}