package livrosBiblioteca;

public class Livros {
    private String tituloLivro;
    private String autorLivro;
    private int anoPulicacao;

    public Livros(String tituloLivro, String autorLivro, int anoPulicacao) {
    }

    public Livros() {
    }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public String getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }

    public int getAnoPulicacao() {
        return anoPulicacao;
    }

    public void setAnoPulicacao(int anoPulicacao) {
        this.anoPulicacao = anoPulicacao;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "tituloLivro: '" + tituloLivro + '\'' +
                ", autorLivro: '" + autorLivro + '\'' +
                ", anoPulicacao: " + anoPulicacao +
                '}';
    }
}
