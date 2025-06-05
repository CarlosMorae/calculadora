package animalEstimacao;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    //Criando Animal
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cachorro("Lilica", 8, "Vira-Lata"));
        animals.add(new Gato("Dante", 5, "Preto, branco e cinza"));
        animals.add(new Passaro("Paraquito", 4, "Branco"));

        for (Animal animal : animals) {
            animal.emitirSom();
            animal.Comer();
            animal.exibirInformacoes();
            System.out.println("---------");
        }
        //Testando idade negativa
        try {
            Animal animalInvalido = new Cachorro("Bili", -1, "Dorbemann");
        }catch (IllegalArgumentException e){
            System.out.println("Erro ao criar o animal: " + e.getMessage());
        }
    }
}
