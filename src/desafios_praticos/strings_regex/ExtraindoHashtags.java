package desafios_praticos.strings_regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtraindoHashtags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o texto: ");
        String texto = scanner.nextLine();

        Pattern pattern = Pattern.compile("#\\w+");
        Matcher matcher = pattern.matcher(texto);

        List<String> hashtags = new ArrayList<>();

        //enquanto matcher achar texto no padrao adicione o ultimo texto que esteja no padrao na lista hashtags
        while (matcher.find()){
            hashtags.add(matcher.group());
        }

        //metodo empty retorna valor booleano caso a lista estiver vazia ou com hashtags
        //metodo join da classe String junta todos os elementos da lista por um separador que for delimitado
        if (hashtags.isEmpty()){
            System.out.println("Nenhuma hashtag encontrada.");
        }else{
            System.out.println("Hashtags encontradas: " + String.join(" ,", hashtags));
        }
    }
}
