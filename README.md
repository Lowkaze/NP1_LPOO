# NP1_LPOO

## Lista de Exercícios 1 – Atividade de POO em Java

Para cada exercício crie um novo projeto ou separe as classes por pacotes (packages). Teste todos os programas na classe principal (classe que contém o método main).

1. (0,5) Crie uma classe para representar uma pessoa, com os atributos privados de nome, data de nascimento e altura. Crie os métodos públicos necessários para sets e gets e também um método para imprimir todos dados de uma pessoa. Crie um método para calcular a idade da pessoa.


2. (0,5) Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as seguintes operações:
    ```java
    void armazenaPessoa(String nome, int idade, float altura);
    void removePessoa(String nome);
    int buscaPessoa(String nome); // informa em que posição da agenda está apessoa
    void imprimeAgenda(); // imprime os dados de todas as pessoas da agenda
    void imprimePessoa(int index); // imprime os dados da pessoa que está na posição “i” da agenda.
    ```
   
3. (1,0) Crie uma classe Televisao e uma classe ControleRemoto que pode controlar o volume e trocar os canais da televisão. O controle de volume permite:
   * aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
   * aumentar e diminuir o número do canal em uma unidade
   * trocar para um canal indicado;
   * consultar o valor do volume de som e o canal selecionado.