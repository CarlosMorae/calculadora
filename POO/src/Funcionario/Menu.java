package Funcionario;

import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario3 = new Funcionario();

        System.out.println("Digite o nome do funcionario");
        funcionario.setNome(scanner.next());
        System.out.println("Digite o salário do funcionário");
        funcionario.setSalario(scanner.nextInt());
        System.out.println("Digite o cargo do funcionário");
        funcionario.setCargo(scanner.next());

        System.out.println(funcionario.toString());

        System.out.println("Digite o nome do funcionario");
        funcionario1.setNome(scanner.next());
        System.out.println("Digite o salário do funcionário");
        funcionario1.setSalario(scanner.nextInt());
        System.out.println("Digite o cargo do funcionário");
        funcionario1.setCargo(scanner.next());

        System.out.println(funcionario1.toString());

        System.out.println("Digite o nome do funcionario");
        funcionario2.setNome(scanner.next());
        System.out.println("Digite o salário do funcionário");
        funcionario2.setSalario(scanner.nextInt());
        System.out.println("Digite o cargo do funcionário");
        funcionario2.setCargo(scanner.next());

        System.out.println(funcionario2.toString());

        System.out.println("Digite o nome do funcionario");
        funcionario3.setNome(scanner.next());
        System.out.println("Digite o salário do funcionário");
        funcionario3.setSalario(scanner.nextInt());
        System.out.println("Digite o cargo do funcionário");
        funcionario3.setCargo(scanner.next());

        System.out.println(funcionario3.toString());
    }
}
