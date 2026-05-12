package exercicios_praticos.strings_regex;

import java.util.Scanner;

public class FormatandoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor: ");
        double valor = scanner.nextDouble();

        //metodo format serve para formatar um texto no modelo printf
        String valorFormatado = String.format("R$ %.2f", valor);
        System.out.println("Valor formatado: " + valorFormatado);
    }
}
