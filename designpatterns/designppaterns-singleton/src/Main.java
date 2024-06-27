import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = Agenda.getInstance();
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Bem-vindo! Por favor, insira os dias a serem ocupados (ou digite 'sair' para encerrar):");

        while (true) {
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("sair")) {
                break;
            }

            String[] dias = input.split(",\\s*");
            for (String dia : dias) {
                agenda.ocuparDia(dia.trim());
                System.out.println("O dia '" + dia.trim() + "' foi ocupado!");

            }
        }

        agenda.getDias();
        scanner.close();
    }
}
