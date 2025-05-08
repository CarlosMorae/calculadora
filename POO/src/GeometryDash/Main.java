package GeometryDash;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = scanner.nextInt();
        System.out.println("Bem-Vindo ao Sistema de Calculadora de Formas Geometricas");
        System.out.println("Qual forma você deseja usar?");
        System.out.println("Opções: \n" + "1. Quadrado \n" + "2. Retângulo");

        switch (opcao) {

            case 1: {
                System.out.println("Digite a cor do quadrado");
                String cor = scanner.next();
                System.out.println("Digite o lado do quadrado");
                double lado = scanner.nextDouble();

                Quadrado quadrado = new Quadrado(cor, lado);

                System.out.println("Perimetro: " + quadrado.calcularPerimetro());
                System.out.println("Área: " + quadrado.calcularArea());
                System.out.println("Volume: " + quadrado.calcularVolume());
            }
        }
    }
}

