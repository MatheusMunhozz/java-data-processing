package desafios_praticos.collections;

import java.util.ArrayList;
import java.util.List;

public class AdicionandoElementosLista {
    public static void main(String[] args) {
        List<String> funcionarios = new ArrayList<>();

        funcionarios.add("João");
        funcionarios.add("Maria");
        funcionarios.add("Vitor");
        funcionarios.add("Ana");

        System.out.println("Lista de funcionários: " + funcionarios);
    }
}
