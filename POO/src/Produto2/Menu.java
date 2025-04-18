package Produto2;

import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Produto2 produto2 = new Produto2();
        Produto2 produto3 = new Produto2();
        Produto2 produto4 = new Produto2();
        Produto2 produto5 = new Produto2();

        System.out.println("Digite o nome do produto");
        produto2.setNome(scanner.next());
        System.out.println("Digite a descrição do produto");
        produto2.setDescricao(scanner.next());
        System.out.println("Digite a quantidade de produtos disponíveis");
        produto2.setQuantidadeDeEstoque(scanner.nextInt());

        System.out.println(produto2.toString());

        System.out.println("Digite o nome do produto");
        produto3.setNome(scanner.next());
        System.out.println("Digite a descrição do produto");
        produto3.setDescricao(scanner.next());
        System.out.println("Digite a quantidade de produtos disponíveis");
        produto3.setQuantidadeDeEstoque(scanner.nextInt());

        System.out.println(produto3.toString());

        System.out.println("Digite o nome do produto");
        produto4.setNome(scanner.next());
        System.out.println("Digite a descrição do produto");
        produto4.setDescricao(scanner.next());
        System.out.println("Digite a quantidade de produtos disponíveis");
        produto4.setQuantidadeDeEstoque(scanner.nextInt());

        System.out.println(produto4.toString());

        System.out.println("Digite o nome do produto");
        produto5.setNome(scanner.next());
        System.out.println("Digite a descrição do produto");
        produto5.setDescricao(scanner.next());
        System.out.println("Digite a quantidade de produtos disponíveis");
        produto5.setQuantidadeDeEstoque(scanner.nextInt());

        System.out.println(produto5.toString());
    }
}