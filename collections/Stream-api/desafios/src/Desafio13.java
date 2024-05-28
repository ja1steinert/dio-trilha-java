import java.util.Arrays;
import java.util.List;

public class Desafio13 {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosEmIntervalo = numeros.stream()
                                                  .filter(n -> 5 <= n && n <= 10)
                                                  .sorted()
                                                  .toList();

        System.out.println(numerosEmIntervalo);
    }
}
