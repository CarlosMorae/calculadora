package SistemadeGeracao;

public class relatorioFinanceiro extends Relatorio{
    private double saldoAtual;

    public relatorioFinanceiro(String Titulo, String dataGeracao, double saldoAtual){
        super(Titulo, dataGeracao);
        this.saldoAtual = saldoAtual;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    @Override
    public void gerarConteudo() {
        System.out.println("Relatório Financeiro: Saldo atual R$ " + saldoAtual);
    }
}