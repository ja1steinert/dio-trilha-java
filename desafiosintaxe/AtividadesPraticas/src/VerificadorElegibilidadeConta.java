import java.util.Scanner;

// Aqui é definido uma classe chamada VerificadorElegibilidadeConta:
public class VerificadorElegibilidadeConta { 

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 

        int idade = scanner.nextInt(); 

// Verifica se a idade é maior ou igual a 18 e imprime uma mensagem informando se o usuário é ou não é elegível para criar uma conta bancária:
       if(idade <= 17) {
        System.out.println("Voce nao esta elegivel para criar uma conta bancaria.");
       } else {
        System.out.println("Voce esta elegivel para criar uma conta bancaria.");
       }

// Fechamos o objeto Scanner para liberar os recursos:
        scanner.close(); 
    }
}