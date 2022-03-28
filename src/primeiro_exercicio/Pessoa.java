package primeiro_exercicio;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

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

    public void imprimirPessoa() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de nascimento: " + this.dataDeNascimento);
        System.out.println("Altura: " + this.altura);
    }

    public void calcularIdade() {
        try {
            DateTimeFormatter formatoDaData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataDeNascimento = LocalDate.parse(this.dataDeNascimento, formatoDaData);
            LocalDate dataAtual = LocalDate.now();
            Period idade = Period.between(dataDeNascimento, dataAtual);

            String anos = idade.getYears() == 1 || idade.getYears() == -1 ? idade.getYears() + " ano, " : idade.getYears() + " anos, ";
            String meses = idade.getMonths() == 1 || idade.getMonths() == -1 ? idade.getMonths() + " mês e " : idade.getMonths() + " meses e ";
            String dias = idade.getDays() == 1 || idade.getDays() == -1 ? idade.getDays() + " dia" : idade.getDays() + " dias";

            System.out.println("Idade: " + anos + meses + dias);
        } catch (NullPointerException nullPointerException) {
            System.out.println("Defina uma data de nascimento!");
        }
    }
}