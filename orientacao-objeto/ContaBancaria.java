public class ContaBancaria {
    // Atributos
    String titular;
    double saldo;
    String numeroConta;

    // Construtor
    public ContaBancaria(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;  // Conta começa zerada
    }

    // Método para depositar
    public void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Depósito de R$ " + valor + " realizado!");
        }
    }

    // Método para sacar
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Saque de R$ " + valor + " realizado!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    // Método para consultar saldo
    public double consultarSaldo() {
        return saldo;
    }

    // Método para exibir informações
    public void exibirInfo() {
        System.out.println("=== Conta Bancária ===");
        System.out.println("Titular: " + titular);
        System.out.println("Número: " + numeroConta);
        System.out.println("Saldo: R$ " + saldo);
    }
}