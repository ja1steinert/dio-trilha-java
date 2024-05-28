import java.util.Arrays;
import java.util.List;

public class Desafio2 {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int numeroSomados = numeros.stream()
                                             .mapToInt(Integer::intValue)
                                             .sum();

        System.out.println("A soma dos números é " + numeroSomados);
    }
}
