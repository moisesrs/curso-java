public class Produto {
    String nome;
    double preco;
    int quantidade;
    boolean ativo;

    // Construtor: mesmo nome da classe, sem tipo de retorno
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Sem this, acessa variaveis locais
    // Com this, acessa atributos da classe
    public void exibirInfo() {
        System.out.println("Produto: " + this.nome + ", Preço: R$ " + preco );
    }



    // Calcula o valor total do estoque do produto
    public double calcularValorEstoque() {
        return preco * quantidade;
    }

    public void adicionarEstoque(int qtd) {
        quantidade = quantidade + qtd;
        System.out.println("quantidade atualizada: " + quantidade);
    }

    public void exibirInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }

}
