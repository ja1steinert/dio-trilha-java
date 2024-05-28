import java.util.Arrays;
import java.util.List;

public class Desafio18 {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean todosIguais = numeros.stream()
        // Executa um "For Each" e compara n ao número de indice 0.
        .allMatch(n -> n.equals(numeros.get(0)));

        System.out.println("Todos os números da lista são iguais? "+ todosIguais);
    }
}
