package desafios_praticos.strings_regex;

import java.util.Scanner;

public class ExtraindoNomeArquivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do arquivo: ");
        String arquivo = scanner.nextLine();

        //lastIndexOf captura o ultimo caracter digitado
        //substring serve para determinar um texto ate um index escolhido
        int posicaoPonto = arquivo.lastIndexOf(".");
        if (posicaoPonto != -1){
            String arquivoSemExtensao = arquivo.substring(0,posicaoPonto);
            System.out.println("Nome do arquivo sem extensão: " + arquivoSemExtensao);
        }else{
            System.out.println("O arquivo não possui extensão.");
        }
        scanner.close();
    }
}
