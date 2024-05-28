import java.util.Arrays;
import java.util.List;

public class Desafio11 {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somarQuadrados = numeros.stream()
                                    .mapToInt(n -> n * n)
                                    .sum();

        System.out.println("A soma dos quadrados dos números é: " + somarQuadrados);
    }
}
