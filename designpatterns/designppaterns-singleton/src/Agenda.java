import java.util.HashMap;

public class Agenda {

    // Singleton
    private static final Agenda Instance = new Agenda();

    // Hashmap que contém os dias da semana e um valor booleano associado à disponibilidade do dia
    private final HashMap<String, Boolean> dias = new HashMap<>();

    // Array auxiliar ao construtor e método getDias
    private final String[] diasDaSemana = new String[]
            {"Segunda","Terca","Quarta","Quinta","Sexta","Sabado","Domingo"};

    // Construtor privado do Singleton, define todos os dias da semana como TRUE (disponíveis)
    private Agenda() {
        for (int i = 0; i < diasDaSemana.length; i++) {
            dias.put(diasDaSemana[i], Boolean.TRUE);
        }

    }

    public static Agenda getInstance() {
        return Instance;
    }

    // Printa a disponibilidade dos dias no console
    public void getDias() {
        System.out.println("-- Agenda da Semana --");

        for (int i = 0; i < diasDaSemana.length; i++) {
            String disponibilidade = dias.get(diasDaSemana[i]) == true ? "Disponível" : "Ocupado";
            System.out.println(diasDaSemana[i] + ": " + disponibilidade);
        }
    }

    // Substitui o valor booleano da chave (dia da semana) por FALSE
    public void ocuparDia(String dia) {
        dias.replace(dia, Boolean.FALSE);
    }

}
