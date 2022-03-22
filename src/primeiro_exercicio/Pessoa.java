package primeiro_exercicio;

public class Pessoa {
    private String nome;
    private String dataDeNascimento;
    private double altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void exibir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de nascimento: " + this.dataDeNascimento);
        System.out.println("Altura: " + this.altura);
    }
}