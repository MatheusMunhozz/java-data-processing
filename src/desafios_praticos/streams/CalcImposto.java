package desafios_praticos.streams;

import java.util.List;

public class CalcImposto {
    public static void main(String[] args) {
        List<Double> precosProdutos = List.of(29.99, 49.50, 15.75, 99.99);

        double totalGasto = precosProdutos.stream().reduce(0.0 ,Double:: sum);

        double imposto = totalGasto * 0.08;
        double totalComImposto = totalGasto + imposto;

        System.out.println("Valor total antes do imposto: " + String.format("%.2f", totalGasto));
        System.out.println("Valor total com imposto de 8%: " + String.format("%.2f", totalComImposto));
    }
}
