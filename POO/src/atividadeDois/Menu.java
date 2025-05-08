package atividadeDois;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Lista de pacientes
        ArrayList<Paciente> pacientes = new ArrayList<>();

        //Loop para criação de pacientes
        for (int contador = 0; contador <= 5; contador++) {
            Paciente paciente = new Paciente();
            System.out.println("Digite o nome completo do paciente");
            paciente.setNome(scanner.nextLine());
            System.out.println("Digite o cpf do paciente");

            //Loop para verificação do CPF
            while (paciente.getCPF().length() != 11) {
                System.out.println("O CPF do paciente deve ter 11 digitos");
                System.out.println("Digite o CPF do paciente");
                paciente.setCPF(scanner.next());
            }
            System.out.println("Digite o email do paciente");
            paciente.setEmail(scanner.next());

            pacientes.add(paciente);

        }
        for (Paciente paciente : pacientes) {
            System.out.println(paciente);
        }
    }
}
