package ContaBancaria;

import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        ContaBancaria contaBancaria1 = new ContaBancaria();

        System.out.println("Digite o número da conta bancaria");
        contaBancaria.setNumeroDaConta(scanner.nextInt());
        System.out.println("Digite o saldo que deseja retirar");
        contaBancaria.setSaldo(scanner.nextInt());

        System.out.println(contaBancaria.toString());

        System.out.println("Digite o número da conta bancaria");
        contaBancaria1.setNumeroDaConta(scanner.nextInt());
        System.out.println("Digite o saldo que deseja retirar");
        contaBancaria1.setSaldo(scanner.nextInt());

        System.out.println(contaBancaria1.toString());
    }
}
