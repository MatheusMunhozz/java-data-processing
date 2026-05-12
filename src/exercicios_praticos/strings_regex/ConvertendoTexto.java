package exercicios_praticos.strings_regex;

import java.util.Scanner;

public class ConvertendoTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o texto: ");
        String texto = scanner.nextLine();

        String minusculas = texto.toUpperCase();
        String maiusculas = texto.toLowerCase();

        System.out.println("Texto em maiúsculas: " + maiusculas);
        System.out.println("Texto em minúsculas: " + minusculas);
        scanner.close();

    }
}
