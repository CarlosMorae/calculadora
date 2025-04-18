package Produto;

import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Produto produto = new Produto();
        Produto produto1 = new Produto();

        System.out.println("Digite o nome do produto");
        produto.setNome(scanner.next());
        System.out.println("Coloque o preço do produto");
        produto.setPreco(scanner.nextInt());

        System.out.println(produto.toString());

        System.out.println("Digite o nome do produto");
        produto1.setNome(scanner.next());
        System.out.println("Coloque o preço do produto");
        produto1.setPreco(scanner.nextInt());

        System.out.println(produto1.toString());
    }
}
