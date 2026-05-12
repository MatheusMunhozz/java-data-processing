package exercicios_praticos.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ElementosUnicos {
    public static void main(String[] args) {
        List<String> eventos = new ArrayList<>();

        eventos.add("IA Conference Brasil");
        eventos.add("AI Summit");
        eventos.add("DevFest");
        eventos.add("Cloud Expo");
        eventos.add("IA Conference Brasil");
        eventos.add("DevFest");

        Set<String> eventosUnicos = new HashSet<>(eventos);

        System.out.println("Lista de eventos: " + eventosUnicos);
    }
}
