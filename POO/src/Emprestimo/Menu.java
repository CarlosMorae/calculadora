package Emprestimo;

import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Emprestimo emprestimo = new Emprestimo();
        Emprestimo emprestimo1 = new Emprestimo();
        Emprestimo emprestimo2 = new Emprestimo();
        Emprestimo emprestimo3 = new Emprestimo();

        System.out.println("Digite o valor do empréstimo");
        emprestimo.setValor(scanner.nextInt());
        System.out.println("Digite a data do empréstimo");
        emprestimo.setDataDeEmprestimo(scanner.next());
        System.out.println("Digite o número de parcelas");
        emprestimo.setNumeroDeParcelas(scanner.nextInt());

        System.out.println(emprestimo.toString());

        System.out.println("Digite o valor do empréstimo");
        emprestimo1.setValor(scanner.nextInt());
        System.out.println("Digite a data do empréstimo");
        emprestimo1.setDataDeEmprestimo(scanner.next());
        System.out.println("Digite o número de parcelas");
        emprestimo1.setNumeroDeParcelas(scanner.nextInt());

        System.out.println(emprestimo1.toString());

        System.out.println("Digite o valor do empréstimo");
        emprestimo2.setValor(scanner.nextInt());
        System.out.println("Digite a data do empréstimo");
        emprestimo2.setDataDeEmprestimo(scanner.next());
        System.out.println("Digite o número de parcelas");
        emprestimo2.setNumeroDeParcelas(scanner.nextInt());

        System.out.println(emprestimo2.toString());

        System.out.println("Digite o valor do empréstimo");
        emprestimo3.setValor(scanner.nextInt());
        System.out.println("Digite a data do empréstimo");
        emprestimo3.setDataDeEmprestimo(scanner.next());
        System.out.println("Digite o número de parcelas");
        emprestimo3.setNumeroDeParcelas(scanner.nextInt());

        System.out.println(emprestimo3.toString());
    }
}
