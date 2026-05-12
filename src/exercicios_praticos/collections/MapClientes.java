package exercicios_praticos.collections;

import java.util.HashMap;
import java.util.Map;

public class MapClientes {
    public static void main(String[] args) {
        //map passa uma chave e um valor
        Map<Integer, String> clientes = new HashMap<>();

        clientes.put(1, "Maria");
        clientes.put(2, "Marcos");
        clientes.put(3, "Ana");

        System.out.println("O nome do cliente com id 2 é " + clientes.get(2));
    }
}
