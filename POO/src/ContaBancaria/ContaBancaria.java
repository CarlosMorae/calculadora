package ContaBancaria;

public class ContaBancaria {
   private int numeroDaConta;
   private double Saldo;

    public ContaBancaria(int numeroDaConta, double saldo){
    }
    public ContaBancaria(){
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }
    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numeroDaConta=" + numeroDaConta +
                ", Saldo=" + Saldo +
                '}';
    }
}

