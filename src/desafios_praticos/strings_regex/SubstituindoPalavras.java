package desafios_praticos.strings_regex;

import java.util.Scanner;

public class SubstituindoPalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o texto: ");
        String texto = scanner.nextLine();

        System.out.print("Digite a palavra a ser substituída: ");
        String palavraAntiga = scanner.nextLine();

        //contains significa se o texto contem uma palavara antiga
        if (!texto.contains(palavraAntiga)) {
            System.out.println("Palavra não encontrada.");
            scanner.close();
            return;
        }

        System.out.print("Digite a nova palavra: ");
        String palavraNova = scanner.nextLine();

        //replace pega uma palavra e substitui por outra
        String textoModificado = texto.replace(palavraAntiga, palavraNova);
        System.out.println("Texto modificado: " + textoModificado);

        scanner.close();
        }
    }

