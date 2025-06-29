package GeometryDash;

import java.util.Scanner;

//Comando para indentação Ctrl+Alt+L
public class Main { // Classe (documento de java)
    static Scanner sc = new Scanner(System.in);

    // Não pode ter uma função dentro de outra função

    public static void main(String[] args) { // função
        int opcao;
        do {
            System.out.println("Bem vindo ao Sistema de Calculadora de Formas Geometricas");
            System.out.println("Qual forma você deseja usar?");
            System.out.println(
                    "Opções: \n" +
                            "0. Sair \n" +
                            "1. Quadrado\n" +
                            "2. Retângulo\n" +
                            "3. Círculo\n");
            opcao = sc.nextInt();

            FormaGeometrica forma;

            switch (opcao) {
                case 0: {
                    System.out.println("Obrigado por usar o Sistema de Calculadora!");
                    break;
                }

                case 1: {
                    System.out.println("Digite a cor do quadrado: ");
                    String cor = sc.next();
                    System.out.println("Digite o lado do quadrado: ");
                    double lado = sc.nextDouble();

                    forma = new Quadrado(cor, lado);

                    int opcao2;
                    do {
                        opcao2 = menuCalculo();

                        retornoCalculos(opcao2, forma);
                    } while (opcao2 != 0);

                    break;
                }
                case 2: {
                    System.out.println("Qual a cor do retangulo: ");
                    String cor = sc.next();
                    System.out.println("Qual a largura do retangulo: ");
                    double largura = sc.nextDouble();
                    System.out.println("Qual a altura do retangulo: ");
                    double altura = sc.nextDouble();
                    System.out.println("Qual o comprimento do retangulo: ");
                    double comprimento = sc.nextDouble();

                    forma = new Retangulo(cor, largura, altura, comprimento);

                    int opcao2;
                    do {
                        opcao2 = menuCalculo();

                        retornoCalculos(opcao2, forma);
                    } while (opcao2 != 0);
                    break;
                }
                case 3: {
                    System.out.println("Qual a cor do círculo:");
                    String cor = sc.next();
                    System.out.println("Qual o raio do círulo:");
                    double raio = sc.nextDouble();
                    System.out.println("Qual o diamentro do círculo:");
                    double diamentro = sc.nextDouble();
                    System.out.println("Qual a circunferência do círculo: ");
                    double circunferencia = sc.nextDouble();

                    forma = new Circulo(cor, raio, diamentro, circunferencia);

                    int opcao3;
                    do {
                        opcao3 = menuCalculo();

                        retornoCalculos(opcao3, forma);
                    } while (opcao3 != 0);
                    break;
                }
            }
        } while (opcao != 0);
    }

    static public int menuCalculo() { // Outra função (Metodo)
        System.out.println("Qual calculo deseja fazer?");
        System.out.println("Opções: \n"
                + "0. Voltar \n"
                + "1. Perimetro\n"
                + "2. Area\n"
                + "3. Volume\n");
        return sc.nextInt();
    }

    // Outra função
    static public void retornoCalculos(int opcao, FormaGeometrica forma) {
        if (opcao < 0 || opcao > 3) {
            System.out.println("Opção Invalida!");
        }

        switch (opcao) {
            case 1: {
                System.out.println("Perimetro: " + forma.calcularPerimetro());
                break;
            }
            case 2: {
                System.out.println("Area: " + forma.calcularArea());
                break;
            }
            case 3: {
                System.out.println("Volume: " + forma.calcularVolume());
                break;
            }
        }
    }
}
