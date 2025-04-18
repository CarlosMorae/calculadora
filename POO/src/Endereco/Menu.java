package Endereco;

import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        Endereco endereco1 = new Endereco();
        Endereco endereco2 = new Endereco();
        Endereco endereco3 = new Endereco();

        System.out.println("Digite o nome da sua rua");
        endereco.setRua(scanner.next());
        System.out.println("Digite o numero da residência");
        endereco.setNumero(scanner.nextInt());
        System.out.println("Digite a cidade onde mora");
        endereco.setCidade(scanner.next());

        System.out.println(endereco.toString());

        System.out.println("Digite o nome da sua rua");
        endereco1.setRua(scanner.next());
        System.out.println("Digite o numero da residência");
        endereco1.setNumero(scanner.nextInt());
        System.out.println("Digite a cidade onde mora");
        endereco1.setCidade(scanner.next());

        System.out.println(endereco1.toString());

        System.out.println("Digite o nome da sua rua");
        endereco2.setRua(scanner.next());
        System.out.println("Digite o numero da residência");
        endereco2.setNumero(scanner.nextInt());
        System.out.println("Digite a cidade onde mora");
        endereco2.setCidade(scanner.next());

        System.out.println(endereco2.toString());

        System.out.println("Digite o nome da sua rua");
        endereco3.setRua(scanner.next());
        System.out.println("Digite o numero da residência");
        endereco3.setNumero(scanner.nextInt());
        System.out.println("Digite a cidade onde mora");
        endereco3.setCidade(scanner.next());

        System.out.println(endereco3.toString());
    }
}
