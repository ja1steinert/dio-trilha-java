import java.util.Arrays;
import java.util.List;

public class Desafio15 {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean algumNegativo = numeros.stream()
                                       .anyMatch(n -> n < 0);

        System.out.println("Existe algum número negativo na lista? " + algumNegativo);
}

}
