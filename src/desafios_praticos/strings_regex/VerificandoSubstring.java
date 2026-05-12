package desafios_praticos.strings_regex;

import java.util.Scanner;

public class VerificandoSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o texto: ");
        String texto = scanner.nextLine();

        System.out.print("Digite a palavra: ");
        String palavra = scanner.nextLine();

        //metodo contains verifica se o texto contem um texto igual
        if (texto.contains(palavra)) {
            System.out.println("A palavra \"" + palavra + "\" está presente no texto.");
        }else {
            System.out.println("A palavra \"" + palavra + "\" não está presente no texto.");
        }
        scanner.close();
    }
}
