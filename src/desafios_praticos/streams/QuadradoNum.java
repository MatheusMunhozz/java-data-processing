package desafios_praticos.streams;

import java.util.List;
import java.util.stream.Collectors;

public class QuadradoNum {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(2, 3, 5, 7, 11);

        //Map transforma cada elemento em outra coisa
        //Filter Filtra elementos (passa ou não passa)
        List<Integer> quadradoNum = numeros.stream().map(numero -> numero * numero).collect(Collectors.toList());

        System.out.println(quadradoNum);
    }
}
