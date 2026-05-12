package desafios_praticos.collections;

import java.util.ArrayList;
import java.util.List;

public class AcessandoElementos {
    public static void main(String[] args) {
        List<String> funcionarios = new ArrayList<>();

        funcionarios.add("João");
        funcionarios.add("Maria");
        funcionarios.add("Ana");
        funcionarios.add("Pedro");
        funcionarios.add("Antônio");

        System.out.println("A segunda pessoa da lista é: " + funcionarios.get(1));
        System.out.println("Total de funcionários: " + funcionarios.size());
    }
}
