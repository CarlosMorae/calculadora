package Empresa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Funcionários
        int opcao;
        do {
            System.out.println("Seja bem-vindo a folha de pagamento");
            System.out.println("De qual hierarquia você é? ");
            System.out.println(
                    "0. Opções: \n" +
                            "0. Sair: \n" +
                            "1. Gerente: \n" +
                            "2. Desenvolvedor: \n" +
                            "3. Estagiario:\n");
            opcao = scanner.nextInt();

            Funcionario funcionario;

            switch (opcao) {
                case 0: {
                    System.out.println("Obrigado por usar a folha de pagamento");
                    break;
                }
                case 1: {
                    System.out.println("Digite o nome do funcionário");
                    String Nome = scanner.next();
                    System.out.println("Digite");
                }
            }
        } while (opcao != 0);
    }
}