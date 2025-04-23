package atvidadeUm;

public class produtoDaAtividade {
    private String nomeProduto;
    private double precoProduto;
    private int quantidadeEstoque;

    public produtoDaAtividade(String nomeProduto, double precoProduto, int quantidadeEstoque) {
    }

    public produtoDaAtividade() {
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public String toString() {
        return "produtoDaAtividade{" +
                "nomeProduto='" + nomeProduto + '\'' +
                ", precoProduto=" + precoProduto +
                ", quantidadeEstoque=" + quantidadeEstoque +
                '}';
    }
}
