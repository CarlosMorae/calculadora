package Transporte;

public class Carro extends Transporte {
    public Carro(String nome, int velocidadeMaxima, int autonomia, String tipoDeCombustivel) {
        super(nome, velocidadeMaxima, autonomia, tipoDeCombustivel);
    }

    @Override
    public void mover() {
        System.out.println("O carro está se movendo");
    }

    @Override
    public void parar() {
        System.out.println("O carro está parando");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("O carro " + getNome() + " está a " + getVelocidadeMaxima() + "km");
        System.out.println("Tipo de combustível usavel: " + getTipoDeCombustivel());
    }
}
