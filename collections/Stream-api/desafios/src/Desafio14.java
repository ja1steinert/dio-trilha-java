import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class Desafio14 {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> numerosPrimos = numeros.stream()
                                             .filter(i -> BigInteger.valueOf(i).isProbablePrime(10))
                                             .findFirst();


        System.out.println(numerosPrimos.get());
    }
}
