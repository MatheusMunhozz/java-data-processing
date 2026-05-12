package exercicios_praticos.streams;

import java.util.List;

public class EstatisticasNotas {
    public static void main(String[] args) {
        List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);

        double somaNotas = notas.stream().reduce(0.0, Double:: sum);

        double media = somaNotas / notas.size();

        double menorNota = notas.stream().min(Double::compare).get();

        double maiorNota = notas.stream().max(Double::compare).get();

        System.out.println("A média das notas é: " + media);
        System.out.println("A menor nota foi: " + menorNota);
        System.out.println("A maior nota foi: " + maiorNota);

    }
}
