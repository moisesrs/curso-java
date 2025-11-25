package com.curso.modulo01;

import java.util.ArrayList;
import java.util.List;

public class TesteProduto {
    public static void main(String[] args) {
        // Criando o primeiro objeto (primeira casa)
        Produto produto1 = new Produto("Notebook", 3500, 10);
        produto1.nome = "Notebook";
        produto1.preco = 1200.00;
        produto1.quantidade = 10;

        // Criando o segundo objeto (segunda casa)
        Produto produto2 = new Produto("Mouse", 35.00, 100);
        produto2.nome = "Mouse";
        produto2.preco = 35.00;
        produto2.quantidade = 100;

        produto1.exibirInfo();  // Produto: Notebook, Preço: R$ 3500.0
        produto2.exibirInfo();  // Produto: Mouse, Preço: R$ 50.0

        // cada objeto tem seus proprios valores
        System.out.println("Informações do Produto 1: " + produto1.nome);
        System.out.println("Informações do Produto 2: " + produto2.nome);

        produto1.exibirInformacoes();
        produto1.adicionarEstoque(10); // adiciona 10 unidades ao estoque

        double valorEstoque = produto1.calcularValorEstoque();
        System.out.println("Qtde total em estoque: " + produto1.quantidade);
        System.out.println("Valor total em estoque: " + valorEstoque);

        produto2.exibirInformacoes();
        System.out.println("Valor total em estoque: " + valorEstoque);

        produto2.adicionarEstoque(20);
        double valorEstoque2 = produto2.calcularValorEstoque();
        System.out.println("Qtde total em estoque: " + produto2.quantidade);
        System.out.println("Valor total atualizado em estoque: " + valorEstoque2);

        Retorno retorno = new Retorno();
        retorno.setQtde(5);
        retorno.setMsg("Operação realizada com sucesso!");

        System.out.println("Retorno - Qtde: " + retorno.getQtde() + ", Mensagem: " + retorno.getMsg());

        List<Long> lista = new ArrayList<>();
        lista.add(1L);
        lista.add(2L);
        lista.add(3L);
        System.out.println("Lista de Long: " + lista);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println("For1 - Valor [" + i + "] = " + lista.get(i));
        }

        Long vr = 0L;
        for (Long l : lista) {
            vr += l;
            System.out.println("For2 - Valor na lista: " + l);
        }
        System.out.println("Soma dos valores na lista: " + vr);

        lista.forEach(aLong -> {
            System.out.println("ForEach - Valor na lista: " + aLong);
        });
    }
}
