package SistemadeGeracao;

public class relatorioVendas extends Relatorio{
    private double totalVendas;

    public relatorioVendas(String Titulo, String dataGeracao, double totalVendas){
        super(Titulo, dataGeracao);
        this.totalVendas = totalVendas;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    @Override
    public void gerarConteudo() {
        System.out.println("Relatório de vendas: Total vendido R$ " + totalVendas );
    }
}