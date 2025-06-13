package Empresa;

import java.util.ArrayList;
import java.util.Scanner;

public class FolhadePagamento {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Lista de funcionários
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Gerente("Roberto",19000 ,52));
        funcionarios.add(new Desenvolvedor("Julio", 9000, "Java"));
        funcionarios.add(new Estagiario("Fausto", 5000, 12));

        for(Funcionario funcionario : funcionarios){
            System.out.println("Funcionário: " + funcionario.getNome());
            System.out.println("salario Base R$: " + funcionario.getSalarioBase());
            System.out.println("Bônus R$: " + funcionario.calcularBonus());
            System.out.println("------------------------------");
        }
    }
}
