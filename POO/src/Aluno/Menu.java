package Aluno;

import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();

        System.out.println("Digite o nome do aluno");
        aluno.setNome(scanner.next());
        System.out.println("Matricula do aluno");
        aluno.setMatricula(scanner.nextInt());
        System.out.println("Digite a nota final do aluno");
        aluno.setNotaFinal(scanner.nextDouble());

        System.out.println(aluno.toString());

        System.out.println("Digite o nome do aluno");
        aluno1.setNome(scanner.next());
        System.out.println("Matricula do aluno");
        aluno1.setMatricula(scanner.nextInt());
        System.out.println("Digite a nota final do aluno");
        aluno1.setNotaFinal(scanner.nextDouble());

        System.out.println(aluno1.toString());

        System.out.println("Digite o nome do aluno");
        aluno2.setNome(scanner.next());
        System.out.println("Matricula do aluno");
        aluno2.setMatricula(scanner.nextInt());
        System.out.println("Digite a nota final do aluno");
        aluno2.setNotaFinal(scanner.nextDouble());

        System.out.println(aluno2.toString());


        System.out.println("Digite o nome do aluno");
        aluno3.setNome(scanner.next());
        System.out.println("Matricula do aluno");
        aluno3.setMatricula(scanner.nextInt());
        System.out.println("Digite a nota final do aluno");
        aluno3.setNotaFinal(scanner.nextDouble());

        System.out.println(aluno3.toString());
    }
}
