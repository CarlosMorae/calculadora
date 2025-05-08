package Celular;

import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Celular celular = new Celular();

        System.out.println("Digite a marca do aparelho");
        celular.setMarca(scanner.next());
        System.out.println("Digite o modelo do aparelho");
        celular.setModelo(scanner.next());
        System.out.println("Digite o preço do aparelho");
        celular.setPreco(scanner.nextDouble());
        System.out.println("Digite a quantidade de memória do aparelho");
        celular.setMemoria(scanner.nextLong());

        System.out.println(celular.toString());
    }
}
