package Exercicio1;

import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Pessoa pessoa1 = new Pessoa();

        System.out.println("Escreva seu nome");
        pessoa.setNome(scanner.next());
        System.out.println("Escreva sua idade");
        pessoa.setIdade(scanner.nextInt());

        System.out.println(pessoa.toString());

        System.out.println("Escreva seu nome");
        pessoa1.setNome(scanner.next());
        System.out.println("Escreva sua idade");
        pessoa1.setIdade(scanner.nextInt());

        System.out.println(pessoa1.toString());
    }
}