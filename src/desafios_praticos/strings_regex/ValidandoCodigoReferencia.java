package desafios_praticos.strings_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidandoCodigoReferencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código de referência.");
        String codigoDeReferencia = scanner.nextLine();

        //pattern cria um padrao de texto
        //matcher cria um "comparador" para ver se bate o texto com o padrao que defini em pattern com o metodo compile
        Pattern pattern = Pattern.compile("^[A-Z]{3}-\\d{4}$");
        Matcher matcher = pattern.matcher(codigoDeReferencia);

        //metodo matches confirma se o texto por inteiro bate com o padrao (pattern)
        if (matcher.matches()){
            System.out.println("O código de referência está válido.");
        }else{
            System.out.println("O código de referência não está válido.");
        }

        scanner.close();
    }
}
