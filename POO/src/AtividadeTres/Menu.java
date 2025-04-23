package AtividadeTres;

import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario3 = new Funcionario();

        System.out.println("Digite o nome do Funcionario");
        funcionario1.setNome(scanner.next());
        System.out.println("Digite a idade do funcionario");
        funcionario1.setIdade(scanner.nextInt());
        System.out.println("Digite a nota final do funcionario");
        funcionario1.setNotaFinal(scanner.nextDouble());

        System.out.println(funcionario1.toString());

        System.out.println("Digite o nome do Funcionario");
        funcionario2.setNome(scanner.next());
        System.out.println("Digite a idade do funcionario");
        funcionario2.setIdade(scanner.nextInt());
        System.out.println("Digite a nota final do funcionario");
        funcionario2.setNotaFinal(scanner.nextDouble());
        System.out.println(funcionario2.toString());

        System.out.println("Digite o nome do Funcionario");
        funcionario3.setNome(scanner.next());
        System.out.println("Digite a idade do funcionario");
        funcionario3.setIdade(scanner.nextInt());
        System.out.println("Digite a nota final do funcionario");
        funcionario3.setNotaFinal(scanner.nextDouble());
        System.out.println(funcionario3.toString());
    }
}
