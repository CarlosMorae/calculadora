package atividadeDois;

import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Paciente paciente1 = new Paciente();
        Paciente paciente2 = new Paciente();

        System.out.println("Digite o nome do paciente");
        paciente1.setNome(scanner.next());
        System.out.println("Digite o CPF");
        paciente1.setCPF(scanner.next());
        System.out.println("Digite o email");
        paciente1.setEmail(scanner.next());

        System.out.println(paciente1.toString());

        System.out.println("Digite o nome do paciente");
        paciente2.setNome(scanner.next());
        System.out.println("Digite o CPF");
        paciente2.setCPF(scanner.next());
        System.out.println("Digite o email");
        paciente2.setEmail(scanner.next());

        System.out.println(paciente2.toString());
    }
}
