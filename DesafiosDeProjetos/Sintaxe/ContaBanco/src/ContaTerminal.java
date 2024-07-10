import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeCliente = solicitarNomeCliente(scanner);
        String agencia = solicitarAgencia(scanner);
        int numero = solicitarNumeroConta(scanner);
        double saldo = solicitarSaldo(scanner);

        exibirMensagemBoasVindas(nomeCliente, agencia, numero, saldo);
    }

    private static String solicitarNomeCliente(Scanner scanner) {
        System.out.println("Olá, seja bem-vindo(a) ao cadastro do Banco Terminal. Por favor, conte-nos o seu nome:");
        return scanner.nextLine();
    }

    private static String solicitarAgencia(Scanner scanner) {
        System.out.println("Que bom tê-lo conosco! Por favor, insira o número da agência:");
        return scanner.nextLine();
    }

    private static int solicitarNumeroConta(Scanner scanner) {
        System.out.println("Ótimo! Agora, por favor insira um número para a conta:");
        return scanner.nextInt();
    }

    private static double solicitarSaldo(Scanner scanner) {
        System.out.println("Ok, agora insira o valor do saldo:");
        return scanner.nextDouble();
    }

    private static void exibirMensagemBoasVindas(String nomeCliente, String agencia, int numero, double saldo) {
        System.out.println("Olá " + nomeCliente + "! Obrigado por criar uma conta em nosso banco. Sua agência é: " + agencia +
                ", número da conta: " + numero + ", e seu saldo de R$" + saldo + " já está disponível para saque.");
    }
}
