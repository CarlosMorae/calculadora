package Empresa;

public class Gerente extends Funcionario {
    private int projetoGerenciados;

    public Gerente(String Nome, double salarioBase, int projetoGerenciados) {
        super(Nome, salarioBase);
        this.projetoGerenciados = projetoGerenciados;
    }

    public Gerente() {
    }

    public int getProjetoGerenciados() {
        return projetoGerenciados;
    }

    public void setProjetoGerenciados(int projetoGerenciados) {
        this.projetoGerenciados = projetoGerenciados;
    }

    @Override
    public double calcularBonus() {
        return getSalarioBase() * 0.15;
    }
}