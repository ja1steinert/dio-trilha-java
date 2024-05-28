import java.util.Arrays;
import java.util.List;

public class Desafio19 {
public static void main(String[] args) {
     List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

     int somarDivisiveis3ou5 = numeros.stream()
                                               .filter(n -> n % 3 == 0 | n % 5 == 0)
                                               // Usando uma Lambda só pra não ficar nulo.
                                               .mapToInt(n -> n)
                                               .sum();
                                               
     System.out.println("Soma dos números que são divisíveis por 3 ou por 5: " + somarDivisiveis3ou5);
}
}
