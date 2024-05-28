import java.util.Arrays;
import java.util.List;

public class Desafio12 {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int multiplicar = numeros.stream()
                                 .reduce(1, (a, b) -> a * b);

        System.out.println("Multiplicação dos números da lista: " + multiplicar);
    }
}
