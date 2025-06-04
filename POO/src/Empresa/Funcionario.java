package Empresa;

public class Funcionario {
    private String Nome;
    private double salarioBase;

    public Funcionario(String Nome, double salarioBase) {
        this.Nome = Nome;
        this.salarioBase = salarioBase;
    }

    public Funcionario() {
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calcularBonus() {
        System.out.println("Não implementado");
        return 0.0;
    }
}
