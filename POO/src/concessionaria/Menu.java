package concessionaria;

import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo();

        System.out.println("Quantidade de Rodas: ");
        veiculo.setQuantidadeRodas(scanner.nextInt());
        System.out.println("Chassi: ");
        veiculo.setChassi(scanner.next());
        System.out.println("Marca: ");
        veiculo.setMarca(scanner.next());
        System.out.println("Tipo: ");
        veiculo.setTipo(scanner.next());

        System.out.println(veiculo.toString());
    }
}
