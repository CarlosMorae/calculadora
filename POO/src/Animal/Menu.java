package Animal;

import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        Animal animal3 = new Animal();

        System.out.println("Diigte o nome do animal");
        animal.setNome(scanner.next());
        System.out.println("Digite a raça do animal");
        animal.setRaca(scanner.next());
        System.out.println("Digite a idade do animal");
        animal.setIdade(scanner.nextInt());

        System.out.println(animal.toString());

        System.out.println("Diigte o nome do animal");
        animal1.setNome(scanner.next());
        System.out.println("Digite a raça do animal");
        animal1.setRaca(scanner.next());
        System.out.println("Digite a idade do animal");
        animal1.setIdade(scanner.nextInt());

        System.out.println(animal1.toString());

        System.out.println("Diigte o nome do animal");
        animal2.setNome(scanner.next());
        System.out.println("Digite a raça do animal");
        animal2.setRaca(scanner.next());
        System.out.println("Digite a idade do animal");
        animal2.setIdade(scanner.nextInt());

        System.out.println(animal2.toString());

        System.out.println("Diigte o nome do animal");
        animal3.setNome(scanner.next());
        System.out.println("Digite a raça do animal");
        animal3.setRaca(scanner.next());
        System.out.println("Digite a idade do animal");
        animal3.setIdade(scanner.nextInt());

        System.out.println(animal3.toString());



    }
}
