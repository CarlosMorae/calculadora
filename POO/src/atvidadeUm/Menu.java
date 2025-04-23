package atvidadeUm;

import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        produtoDaAtividade produtoDaAtividade1 = new produtoDaAtividade();
        produtoDaAtividade produtoDaAtividade2 = new produtoDaAtividade();

        System.out.println("Digite o nome do produto");
        produtoDaAtividade1.setNomeProduto(scanner.next());
        System.out.println("Digite o preço do produto");
        produtoDaAtividade1.setPrecoProduto(scanner.nextDouble());
        System.out.println("Digite a quantidade em estoque");
        produtoDaAtividade1.setQuantidadeEstoque(scanner.nextInt());

        System.out.println(produtoDaAtividade1.toString());

        System.out.println("Digite o nome do produto");
        produtoDaAtividade2.setNomeProduto(scanner.next());
        System.out.println("Digite o preço do produto");
        produtoDaAtividade2.setPrecoProduto(scanner.nextDouble());
        System.out.println("Digite a quantidade em estoque");
        produtoDaAtividade2.setQuantidadeEstoque(scanner.nextInt());

        System.out.println(produtoDaAtividade2.toString());



    }
}
