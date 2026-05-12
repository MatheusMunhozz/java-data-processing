package desafios_praticos.collections;

import java.util.ArrayList;
import java.util.List;

public class RemovendoElementos {
    public static void main(String[] args) {
        List<String> funcionarios = new ArrayList<>();

        funcionarios.add("Joana");
        funcionarios.add("Lucas");
        funcionarios.add("Pedro");
        funcionarios.add("Antônio");

        System.out.println("Lista inicial: " + funcionarios);

        funcionarios.remove("Pedro");

        System.out.println("Lista após a exclusão: " + funcionarios);
    }
}
