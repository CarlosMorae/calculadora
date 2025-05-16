package cadastroVeiculos;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Lista dos veículos
        ArrayList<Ferrari> ferraris = new ArrayList<>();

        //Modelo dos veículos
        for (int contador = 0; contador <= 2; contador++) {
            Ferrari ferrari = new Ferrari();
            System.out.println("Digite o modelo do veículo");
            ferrari.setModeloVeiculo(scanner.next());

            //Placa dos veículos
            while (ferrari.getPlaca().length() != 7) {
                System.out.println("A placa deve conter 7 caracteres");
                System.out.println("Digite os caracteres da placa do veículo");
                ferrari.setPlaca(scanner.next());
            }
            //Quilometragem
            while (ferrari.getQuilometragem() < 0) {
                System.out.println("A quilometragem não pode ser negativa");
                System.out.println("Digite a quilometragem do veículo");
                ferrari.setQuilometragem(scanner.nextDouble());
            }
        }
    }
}
