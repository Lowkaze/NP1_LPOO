package primeiro_exercicio;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private String dataDeNascimento;
    private float altura;

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

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void imprimirPessoa() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de nascimento: " + this.dataDeNascimento);
        System.out.println("Altura: " + this.altura);
    }

    public void calcularIdade() {
        String dataDeNascimento = this.dataDeNascimento;
        String[] dataSeparada = dataDeNascimento.split("/");

        int anoDeNascimento = Integer.parseInt(dataSeparada[2]);
        int anoAtual = LocalDate.now().getYear();

        System.out.println(anoAtual - anoDeNascimento);
    }
}