import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    // Adicionar uma nova conta ao banco
    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    // Buscar conta por número
    public Conta buscarContaPorNumero(int numero) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null; // Retorna null se a conta não for encontrada
    }

    // Remover conta do banco
    public void removerConta(int numero) {
        Conta conta = buscarContaPorNumero(numero);
        if (conta != null) {
            contas.remove(conta);
        }
    }
}
