import java.util.Arrays;
import java.util.List;

public class Desafio9 {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> listaFiltrada = numeros.stream().distinct().toList();

        boolean verificarDuplicados = listaFiltrada.stream().count() != numeros.size();

        System.out.println("A lista de números tem números duplicados: " + verificarDuplicados);
    }
}
