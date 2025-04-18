package Livro;

import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Livro livro = new Livro();
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();

        System.out.println("Titulo do livro");
        livro.setTitulo(scanner.next());
        System.out.println("Autor do livro");
        livro.setAutor(scanner.next());
        System.out.println("Digite o ano de publicação do livro");
        livro.setAnoDePublicacao(scanner.nextInt());

        System.out.println(livro.toString());

        System.out.println("Titulo do livro");
        livro1.setTitulo(scanner.next());
        System.out.println("Autor do livro");
        livro1.setAutor(scanner.next());
        System.out.println("Digite o ano de publicação do livro");
        livro1.setAnoDePublicacao(scanner.nextInt());

        System.out.println(livro1.toString());


        System.out.println("Titulo do livro");
        livro2.setTitulo(scanner.next());
        System.out.println("Autor do livro");
        livro2.setAutor(scanner.next());
        System.out.println("Digite o ano de publicação do livro");
        livro2.setAnoDePublicacao(scanner.nextInt());

        System.out.println(livro2.toString());

    }
}
