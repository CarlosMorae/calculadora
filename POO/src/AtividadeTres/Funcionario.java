package AtividadeTres;

public class Funcionario {
    private String Nome;
    private int Idade;
    private double notaFinal;

    public Funcionario(String Nome, int Idade, double notaFinal) {
    }

    public Funcionario() {
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "Nome:'" + Nome + '\'' +
                ", Idade:" + Idade +
                ", notaFinal:" + notaFinal +
                '}';
    }
}
