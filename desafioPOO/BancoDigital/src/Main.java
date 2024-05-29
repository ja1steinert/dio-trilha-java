public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.setNome("Meu Banco Digital");

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Evanilton");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("João");

        Conta conta1 = new ContaCorrente(cliente1); 
        Conta conta2 = new ContaPoupanca(cliente2); 

        conta1.depositar(1000.0);
        conta2.depositar(2000.0);

        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);

        // Busca uma conta por número
        Conta contaEncontrada = banco.buscarContaPorNumero(1);
        if (contaEncontrada != null) {
            System.out.println("Conta encontrada:");
            contaEncontrada.imprimirInfosComuns();
        } else {
            System.out.println("Conta não encontrada.");
        }
    }
}
