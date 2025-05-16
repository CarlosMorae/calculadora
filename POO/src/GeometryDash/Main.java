package GeometryDash;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("Bem vindo ao Sistema de Calculadora de Formas Geometricas");
            System.out.println("Qual forma você deseja usar?");
            System.out.println("Opções: \n0. Sair \n1. Quadrado\n2. Retângulo\n");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 0:
                    System.out.println("Obrigado por usar o Sistema de Calculadora!");
                    break;
                case 1:
                    System.out.println("Digite a cor do quadrado: ");
                    String cor = scanner.next();
                    System.out.println("Digite o lado do quadrado: ");
                    double lado = scanner.nextDouble();
                    Quadrado quadrado = new Quadrado(cor, lado);

                    int opcao2;
                    do {
                        opcao2 = menuCalculo();
                        if (opcao2 < 0 || opcao2 > 3) {
                            System.out.println("Opção Invalida!");
                        }

                        switch (opcao2) {
                            case 1:
                                System.out.println("Perimetro: " + quadrado.calcularPerimetro());
                                break;
                            case 2:
                                System.out.println("Area: " + quadrado.calcularArea());
                                break;
                            case 3:
                                System.out.println("Volume: " + quadrado.calcularVolume());
                        }
                    } while (opcao2 != 0);
            }
        } while (opcao != 0);

    }

    public static int menuCalculo() {
        System.out.println("Qual calculo deseja fazer?");
        System.out.println("Opções: \n0. Voltar \n1. Perimetro\n2. Area\n3. Volume\n");
        return scanner.nextInt();
    }

    static {
        scanner = new Scanner(System.in);
    }
}