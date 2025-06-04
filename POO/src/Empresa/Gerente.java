package Empresa;

public class Gerente extends Funcionario {
    private int projetosGerenciados;

    public Gerente(String Nome, double salarioBase, int projetosGerenciados) {
        super(Nome, salarioBase);
        this.projetosGerenciados = projetosGerenciados;
    }

    public int getProjetosGerenciados() {
        return projetosGerenciados;
    }

    public void setProjetosGerenciados(int projetosGerenciados) {
        this.projetosGerenciados = projetosGerenciados;
    }

    @Override
    public double calcularBonus() {
        return getSalarioBase() * 0.15;
    }

}
