package set;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
// Atributo: conjunto de palavras unicas
private Set<String> palavrasUnicasSet;

public ConjuntoPalavrasUnicas() {
    this.palavrasUnicasSet = new HashSet<>();
}

public void adicionarPalavra(String palavra) {
    palavrasUnicasSet.add(palavra);
}

public void removerPalavra(String palavra) {
    if(!palavrasUnicasSet.isEmpty()) {
      if(palavrasUnicasSet.contains(palavra)) {
        palavrasUnicasSet.remove(palavra);
        System.out.println("A palavra " + palavra + " foi removida com sucesso!");
      }
    } else {
        System.out.println("O conjunto está vazio!");
    }
}

public boolean verificarPalavra(String palavra) {
    return palavrasUnicasSet.contains(palavra);
}

public void exibirPalavrasUnicas() {
    if(!palavrasUnicasSet.isEmpty()) {
        System.out.println(palavrasUnicasSet);
      } else {
        System.out.println("O conjunto está vazio!");
      }
}


public static void main(String[] args) {
    // Instanciando um objeto da classe Conjunto Palavras Unicas
    ConjuntoPalavrasUnicas objeto = new ConjuntoPalavrasUnicas();

    // Testando os métodos
    objeto.adicionarPalavra("bosta");
    objeto.adicionarPalavra("excremento");
    objeto.exibirPalavrasUnicas();
    objeto.verificarPalavra("bosta");
    objeto.removerPalavra("bosta");
    objeto.verificarPalavra("bosta");

    System.out.println("A palavra 'cocô' está no conjunto? " + objeto.verificarPalavra("cocô"));

}
}
