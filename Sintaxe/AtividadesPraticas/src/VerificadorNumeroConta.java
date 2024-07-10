import java.util.Scanner; 

public class VerificadorNumeroConta { 

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        String numeroConta = scanner.nextLine();

        try {
            verificarNumeroConta(numeroConta);
        } catch (IllegalArgumentException e) {    
// Aqui é impresso uma mensagem de erro, mostrando a mensagem associada à exceção:
            System.out.println("Erro: " + e.getMessage()); 
        } finally {
            scanner.close();
        }
    }

// Declaração do método verificarNumeroConta, que verifica se o número de conta tem exatamente 8 dígitos:
    private static void verificarNumeroConta(String numeroConta) { 
    if(numeroConta.length() != 8) {
        throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
    } else {
        System.out.println("Numero de conta valido.");
    }
        }
    }
