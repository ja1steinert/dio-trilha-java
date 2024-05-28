import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Desafio extra: Colocar os números pares em ordem decrescente!
public class Desafio4 {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPares = numeros.stream()
                                            .filter(n -> n % 2 == 0)
                                            .sorted((a, b) -> b.compareTo(a))
                                            .collect(Collectors.toList());
                                            

        System.out.println(numerosPares);

    }
}
