package Funcionarios;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Administrador("Luís", "139.293.128-90", 8000));
        funcionarios.add(new Desenvolvedor("Manuela", "890.362.783-70", 11000));
        funcionarios.add(new suporteTecnico("Antônio", "539.172.273.90", 6000));

        for(Funcionario funcionario : funcionarios){
            funcionario.exibirCargo();
            System.out.println("Nome do funcionário: " + funcionario.getNome());
            System.out.println("CPF do funcionário: " + funcionario.getCpf());
            funcionario.exibirInformacoes();
            System.out.println("-------------------------------------------");
        }
    }
}
