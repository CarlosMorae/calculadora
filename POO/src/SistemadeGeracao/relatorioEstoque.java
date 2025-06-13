package SistemadeGeracao;

public class relatorioEstoque extends Relatorio{
    private int itensEmEstoque;

    public relatorioEstoque(String Titulo, String dataGeracao, int itensEmEstoque){
        super(Titulo, dataGeracao);
        this.itensEmEstoque = itensEmEstoque;
    }

    public int getItensEmEstoque() {
        return itensEmEstoque;
    }

    public void setItensEmEstoque(int itensEmEstoque) {
        this.itensEmEstoque = itensEmEstoque;
    }

    @Override
    public void gerarConteudo() {
        System.out.println("Relatório de Estoque: itens em estoque " + itensEmEstoque);
    }
}
