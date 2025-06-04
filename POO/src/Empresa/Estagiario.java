package Empresa;

public class Estagiario extends Funcionario {
    private int horasEstagio;

    public Estagiario(String Nome, double salarioBase, int horasEstagio) {
        super(Nome, salarioBase);
        this.horasEstagio = horasEstagio;
    }

    public int getHorasEstagio() {
        return horasEstagio;
    }

    public void setHorasEstagio(int horasEstagio) {
        this.horasEstagio = horasEstagio;
    }

    @Override
    public double calcularBonus() {
        return getSalarioBase() * 0.05;
    }
}
