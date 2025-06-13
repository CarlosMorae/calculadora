package Empresa;

public class Desenvolvedor extends Funcionario{
    private String linguagemPreferida;

    public Desenvolvedor(String Nome, double salarioBase, String linguagemPreferida) {
        super(Nome, salarioBase);
        this.linguagemPreferida = linguagemPreferida;
    }

    public Desenvolvedor(){
    }

    public String getLinguagemPreferida() {
        return linguagemPreferida;
    }

    public void setLinguagemPreferida(String linguagemPreferida) {
        this.linguagemPreferida = linguagemPreferida;
    }

    @Override
    public double calcularBonus() {
        return getSalarioBase() * 0.10;
    }
}
