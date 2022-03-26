package segundo_exercicio;

import java.util.ArrayList;
import java.util.HashMap;

public class Agenda {
    private ArrayList<HashMap<String, String>> listaDePessoas = new ArrayList<HashMap<String, String>>();

    public void armazenaPessoa(String nome, int idade, float altura) {
        HashMap<String, String> pessoa = new HashMap<String, String>();
        String idadeConvertida = Integer.toString(idade);
        String alturaConvertida = Float.toString(altura);

        if (listaDePessoas.size() < 10) {
            pessoa.put("Nome", nome);
            pessoa.put("Idade", idadeConvertida);
            pessoa.put("Altura", alturaConvertida);
            listaDePessoas.add(pessoa);
        }
    }

    public void removePessoa(String nome) {
        int pessoa = buscaPessoa(nome);

        if (pessoa != -1) {
            listaDePessoas.remove(pessoa);
        } else {
            System.out.println("Essa pessoa não está cadastrada!");
        }
    }

    public int buscaPessoa(String nome) {
        for (int i = 0; i < listaDePessoas.size(); i++) {
            if (listaDePessoas.get(i).get("Nome").equals(nome)) {
                return i;
            }
        }

        return -1;
    }

    public void imprimeAgenda() {
        if (listaDePessoas.size() > 0) {
            for (HashMap<String, String> pessoa : listaDePessoas) {
                System.out.println("Nome: " + pessoa.get("Nome"));
                System.out.println("Idade: " + pessoa.get("Idade"));
                System.out.println("Altura: " + pessoa.get("Altura"));
                System.out.println("------------------------------");
            }
        } else {
            System.out.println("A agenda está vazia!");
        }
    }

    public void imprimePessoa(int index) {
        try {
            System.out.println("Nome: " + listaDePessoas.get(index).get("Nome"));
            System.out.println("Idade: " + listaDePessoas.get(index).get("Idade"));
            System.out.println("Altura: " + listaDePessoas.get(index).get("Altura"));
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            System.out.println("Essa pessoa não está cadastrada!");
        }
    }
}
