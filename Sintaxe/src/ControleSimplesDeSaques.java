import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o valor do limite diário:
        double limiteDiario = scanner.nextDouble();

        // Cria um loop 'for' para iterar sobre os saques:
        for (; limiteDiario > 0;) {
            // Solicita ao usuário o valor do saque:
            double valorSaque = scanner.nextDouble();
            // Verifica se o valor do saque é zero, encerrando as transações:
            if (valorSaque <= 0.0) {
                System.out.println("Transacoes encerradas.");
                scanner.close();
                System.exit(0);

                // Se o valor do saque ultrapassar o limite diário, o programa é encerrado.
            } else if (valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                scanner.close();
                System.exit(0);

            } else {
                // Se o valor do saque não ultrapassar o limite diário, subtraia o valor do saque do limite diário:
                limiteDiario = limiteDiario - valorSaque;
                // Informa que o saque foi realizado e o limite restante.
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            }
        }

        // Fechamos o Scanner para evitar vazamento de recursos:
        scanner.close();
    }
}
