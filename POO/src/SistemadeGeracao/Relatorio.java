package SistemadeGeracao;

public abstract class Relatorio {
    private String Titulo;
    private String dataGeracao;

    public Relatorio(String Titulo, String dataGeracao){
        this.Titulo = Titulo;
        this.dataGeracao = dataGeracao;
    }

    private String getTitulo() {
        return Titulo;
    }

    private void setTitulo(String titulo) {
        Titulo = titulo;
    }

    private String getDataGeracao() {
        return dataGeracao;
    }

    private void setDataGeracao(String dataGeracao) {
        this.dataGeracao = dataGeracao;
    }
    //Retorna os conteúdos dos relatórios
    public abstract void gerarConteudo();

    //Imprima os relatórios
    public void imprimir(){
        System.out.println("Título: " + getTitulo());
        System.out.println("Data da geração: " + getDataGeracao());
    }

}
