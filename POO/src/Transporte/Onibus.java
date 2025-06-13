package Transporte;

public class Onibus extends Transporte {
    public Onibus(String nome, int velocidadeMaxima, int autonomia, String tipoDeCombustivel) {
        super(nome, velocidadeMaxima, autonomia, tipoDeCombustivel);
    }

    @Override
    public void mover() {
        System.out.println("O onibus está se movendo");
    }

    @Override
    public void parar() {
        System.out.println("O onibus está parando");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("O onibus " + getNome() + ",está em " + getVelocidadeMaxima() + "km");
        System.out.println("Tipo de combustível usavel: " + getTipoDeCombustivel());
    }
}
