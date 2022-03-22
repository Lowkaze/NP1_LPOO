import primeiro_exercicio.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa =  new Pessoa();
        pessoa.setNome("Fabrilhos");
        pessoa.setDataDeNascimento("11/11/1111");
        pessoa.setAltura(30.5);
        pessoa.exibir();
    }
}
