import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0; 
        System.out.println("1. Depositar");
        System.out.println("2. Sacar");
        System.out.println("3. Consultar saldo");
        System.out.println("0. Encerrar");

        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) { 

            int opcao = scanner.nextInt(); 

            switch (opcao) {
              case 0: System.out.println("Programa encerrado.");
                      System.exit(0);

              case 1: float valorDeposito = scanner.nextFloat();
                      saldo = valorDeposito + saldo;
                      System.out.println("Saldo atual: " + saldo);
                      break;

              case 2: float valorSacado = scanner.nextFloat();
                      if (valorSacado > saldo) {
                        System.out.println("Saldo insuficiente.");
                      } else {
                        saldo = saldo - valorSacado;
                        System.out.println("Saldo atual: " + saldo);
                      }
                      break;
                      
              case 3: System.out.println("Saldo atual: " + saldo);
                      break;
            
        
        
        // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:    
                default:
                    System.out.println("Opção inválida. Tente novamente."); 
            }
            scanner.close();
        }
    }
}