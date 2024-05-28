import java.util.Arrays;
import java.util.List;

public class Desafio16 {
public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> listaPares = numeros.stream()
                                          .filter(n -> n % 2 == 0)
                                          .sorted()
                                          .toList();

        List<Integer> listaImpares = numeros.stream()
                                          .filter(n -> n % 2 != 0)
                                          .sorted()
                                          .toList();                               

        System.out.println(listaPares);
        System.err.println(listaImpares);
}
}
