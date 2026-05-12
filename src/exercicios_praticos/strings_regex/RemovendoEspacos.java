package exercicios_praticos.strings_regex;

import java.util.Scanner;

public class RemovendoEspacos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();

        //o metodo trim remove
        String nomeFormatado = nome.trim();
        System.out.println("Nome sem espaços: " + nomeFormatado);
        scanner.close();
    }
}
