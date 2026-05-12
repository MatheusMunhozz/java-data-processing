package aprendizado_ativo;

public class StringsFormatacao {
    public static void main(String[] args) {
        String professor = "Jacqueline Oliveira";

        String disciplina = "Java e Programação Orientada a Objetos";

        String curriculo = ""
                + "Pós-graduada em Engenharia e "
                + "Arquitetura de Software; "
                + "Desenvolvedora backend Java desde 2010; "
                + "";

        //metodo trim serve para retirar espacos desnecessarios
        //metodo toUpperCase serve para todas as letras maiusculas do nosso texto
        String texto = String.format("Disciplina: %s - %s", disciplina.trim(), professor.toUpperCase());
        System.out.println(texto);

        //replace serve para substituir uma parte do texto por outro texto
        System.out.printf("Nome: %s %nDisciplina: %s", professor.replace("Oliveira", "Magalhães"), disciplina);
    }
}
