package Transporte;

public abstract class Transporte {
    private String nome;
    private int velocidadeMaxima;
    private int autonomia;
    private String tipoDeCombustivel;

    public Transporte(String nome, int velocidadeMaxima, int autonomia, String tipoDeCombustivel) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
        this.autonomia = autonomia;
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        if (velocidadeMaxima >= 5) {
            this.velocidadeMaxima = velocidadeMaxima;
        } else {
            System.out.println("A velocidade máxima deve ser maior que 5km");
        }
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        if (autonomia > 0) {
            this.autonomia = autonomia;
        } else {
            System.out.println("A autonomia não pode ser menor que 0km");
        }
    }

    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    public void setTipoDeCombustivel(String tipoDeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public abstract void mover();

    public abstract void parar();

    public abstract void exibirInformacoes();
}
