import java.util.Arrays;
import java.util.List;
import java.math.BigInteger;

public class Desafio17 {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPrimos = numeros.stream()
                                            .filter(n -> BigInteger.valueOf(n).isProbablePrime(10))
                                            .sorted()
                                            .toList();

        System.out.println(numerosPrimos);
    }
}
