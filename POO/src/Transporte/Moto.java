package Transporte;

public class Moto extends Transporte {
    public Moto(String nome, int velocidadeMaxima, int autonomia, String tipoDeCombustivel) {
        super(nome, velocidadeMaxima, autonomia, tipoDeCombustivel);
    }

    @Override
    public void mover() {
        System.out.println("A moto está se movendo");
    }

    @Override
    public void parar() {
        System.out.println("A moto está parando");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("A moto " + getNome() + ", está a " + getVelocidadeMaxima() + "km");
        System.out.println("Tipo de combustível usavel: " + getTipoDeCombustivel());
    }
}
