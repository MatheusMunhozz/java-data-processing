package aprendizado_ativo;

import java.util.*;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class Colecoes {
    public static void main(String[] args) {

                // Trabalhando com List
                List<String> funcionarios = new ArrayList<>();
                funcionarios.add("João");
                funcionarios.add("Maria");
                funcionarios.add("João");

                System.out.println(funcionarios);
                System.out.println(funcionarios.get(0));
                System.out.println(funcionarios.get(1));

                // Trabalhando com Set
                // nao permite elementos dulicados na colecao
                Set<String> produtos = new HashSet<>();
                produtos.add("Água");
                produtos.add("Coca-cola");
                produtos.add("Água");

                System.out.println(produtos);

                // Trabalhando com Map
                //faz com que a colecao nescessite de pares, uma chave e um valor
                Map<Integer, String> clientes = new HashMap<>();
                clientes.put(1, "Maria");
                clientes.put(2, "Marcos");
                clientes.put(3, "Ana");

                System.out.println(clientes);
                System.out.println(clientes.get(1));
                System.out.println(clientes.get(2));
            }
        }
