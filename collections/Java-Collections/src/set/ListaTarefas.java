package set;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
private Set<Tarefa> listaDeTarefas;

public ListaTarefas() {
    this.listaDeTarefas = new HashSet<>();
}

public void adicionarTarefa(String descricao) {
    listaDeTarefas.add(new Tarefa(descricao));
}

public void removerTarefa(String descricao) {
    Tarefa removerEstaTarefa = null;
    if(!listaDeTarefas.isEmpty()) {
     for (Tarefa t : listaDeTarefas) {
        if(t.getDescricao().equalsIgnoreCase(descricao)) {
          removerEstaTarefa = t;
          break;
        }
     }
     listaDeTarefas.remove(removerEstaTarefa);
    } else {
        System.out.println("A lista está vazia!");
    }

    if(removerEstaTarefa == null) {
        System.out.println("Tarefa não encontrada!");
      }
}

public void exibirTarefas() {
    System.out.println(listaDeTarefas);
}

public int contarTarefas() {
    return listaDeTarefas.size();
  }

public Set<Tarefa> obterTarefasConcluidas() {
    Set<Tarefa> tarefasConcluidas = new HashSet<>();
    for (Tarefa t : listaDeTarefas) {
        if(t.isConcluida() == true) {
            tarefasConcluidas.add(t);
        }
    }
    return tarefasConcluidas;
}

public Set<Tarefa> obterTarefasPendentes() {
    Set<Tarefa> tarefasPendentes = new HashSet<>();
    for (Tarefa t : listaDeTarefas) {
        if(t.isConcluida() == false) {
            tarefasPendentes.add(t);
        }
    }
    return tarefasPendentes;
}

public void tarefaConcluida(String descricao) {
    for (Tarefa t : listaDeTarefas) {
        if (t.getDescricao().equalsIgnoreCase(descricao)) {
            t.setConcluida(true);
            System.out.println("A tarefa foi concluída!");
        }
    }
}

public void tarefaPendente(String descricao) {
    for (Tarefa t : listaDeTarefas) {
        if (t.getDescricao().equalsIgnoreCase(descricao)) {
            t.setConcluida(false);
            System.out.println("A tarefa está pendente!");
        }
    }
}

public void limparListaTarefas() {
    listaDeTarefas.clear();
    System.out.println("Lista de tarefas limpa.");
}


public static void main(String[] args) {
    // Criando uma instância da classe ListaTarefas
    ListaTarefas listaTarefas = new ListaTarefas();

    listaTarefas.adicionarTarefa("Estudar Java");
    listaTarefas.adicionarTarefa("Caminhar 1000km");
    listaTarefas.adicionarTarefa("Ler livro");

    listaTarefas.exibirTarefas();

    listaTarefas.removerTarefa("Caminhar 1000km");
    listaTarefas.exibirTarefas();

    // Contando o número de tarefas na lista
    System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

    // Obtendo tarefas pendentes
    System.out.println(listaTarefas.obterTarefasPendentes());

    // Marcando tarefas como concluídas
    listaTarefas.tarefaConcluida("Ler livro");
    listaTarefas.tarefaConcluida("Estudar Java");

    // Obtendo tarefas concluídas
    System.out.println(listaTarefas.obterTarefasConcluidas());

    // Marcando tarefas como pendentes
    listaTarefas.tarefaPendente("Estudar Java");
    listaTarefas.exibirTarefas();

    // Limpando a lista de tarefas
    listaTarefas.limparListaTarefas();
    listaTarefas.exibirTarefas();

}
}
