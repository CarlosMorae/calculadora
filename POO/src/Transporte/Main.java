package Transporte;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Transporte> transportes = new ArrayList<>();
        transportes.add(new Carro("Gol", 400, 90, "Reator núclear"));
        transportes.add(new Moto("corno", 15, 2, "Tamanho da cornice"));
        transportes.add(new Onibus("Onibus", 70, 20, "Gasolina"));
        transportes.add(new Bicicleta("Bike 3000", 40, 10, "Eletricidade"));

        for (Transporte transporte : transportes) {
            System.out.println("Nome do veiculo: " + transporte.getNome());
            System.out.println("Velocidade do veiculo: " + transporte.getVelocidadeMaxima());
            System.out.println("Autonomia do veiculo: " + transporte.getAutonomia());
            transporte.exibirInformacoes();
            System.out.println("----------------------------------------------------");
        }
    }
}
