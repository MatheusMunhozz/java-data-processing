package exercicios_praticos.strings_regex;

import java.util.Scanner;

public class ValidandoCpf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite aqui seu cpf: ");
        String cpf = scanner.nextLine();

        String regex = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";

        //o metodo com o parametro regex é um atalho que faz exatamente a mesma coisa do Pattern e Matcher emm uma linha
        if (cpf.matches(regex)) {
            System.out.println("O CPF " + cpf + " está no formato válido");
        }else{
            System.out.println("O CPF " + cpf + " não está no formato válido.");
        }
        scanner.close();
        }
    }

