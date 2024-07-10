import java.util.Scanner;


class ContaBancaria {
    private double saldo;

    // Getter 
    public double getSaldo() {
        return saldo;
    }

    // Setter
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Construtor
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Soma o valor de entrada ao valor do saldo
    public void depositar(double valor) {
        this.setSaldo(saldo + valor);
        System.out.println("Deposito feito.");
        imprimirSaldo();
    }

    // Verifica se o valor do saldo é inferior ao valor do saque e remove o valor sacado do saldo
    public void sacar(double valor) {
        if (this.getSaldo() >= valor) {
        this.setSaldo(saldo - valor);
        System.out.println("Saque feito.");
        imprimirSaldo();
        } else {
            System.out.println("Saldo insuficiente. Saque nao realizado.");
        }
        
    }
    
    private void imprimirSaldo() {
        System.out.printf("Saldo atual: %.1f\n", this.saldo);
    }

}

public class MainContaBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê a Entrada com o valor do saldo e aciona o construtor
        double saldoInicial = scanner.nextDouble();
        ContaBancaria conta = new ContaBancaria(saldoInicial);

        // Lê a Entrada com o valor do deposito e aciona o método "depositar"
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);

        // Lê a Entrada com o valor do saque e aciona o método "sacar"
        double valorSaque = scanner.nextDouble();
        conta.sacar(valorSaque);

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
