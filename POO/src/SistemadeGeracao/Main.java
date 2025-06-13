package SistemadeGeracao;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Relatorio> relatorios = new ArrayList<>();

        relatorios.add(new relatorioVendas("Sofá", "20/08/2003", 799));
        relatorios.add(new relatorioFinanceiro("Estante","15/02/2003", 500 ));
        relatorios.add(new relatorioEstoque("Sofá e Estante", "25/10/2003", 5000));

        for(Relatorio relatorio : relatorios){
            relatorio.imprimir();
            relatorio.gerarConteudo();
            System.out.println("-------");
        }
    }
}
