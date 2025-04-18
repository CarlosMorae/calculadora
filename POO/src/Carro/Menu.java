package Carro;

import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        System.out.println("Digite  marca do veículo");
        carro.setMarca(scanner.next());
        System.out.println("Digite o modelo do veículo");
        carro.setModelo(scanner.next());
        System.out.println("Digite o ano da fabricação do veículo");
        carro.setAno(scanner.nextInt());

        System.out.println(carro.toString());

        System.out.println("Digite  marca do veículo");
        carro1.setMarca(scanner.next());
        System.out.println("Digite o modelo do veículo");
        carro1.setModelo(scanner.next());
        System.out.println("Digite o ano da fabricação do veículo");
        carro1.setAno(scanner.nextInt());

        System.out.println(carro1.toString());

        System.out.println("Digite  marca do veículo");
        carro2.setMarca(scanner.next());
        System.out.println("Digite o modelo do veículo");
        carro2.setModelo(scanner.next());
        System.out.println("Digite o ano da fabricação do veículo");
        carro2.setAno(scanner.nextInt());

        System.out.println(carro2.toString());
    }
}
