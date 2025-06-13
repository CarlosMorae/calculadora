package Transporte;

public class Bicicleta extends Transporte {
    public Bicicleta(String nome, int velocidadeMaxima, int autonomia, String tipoDeCombustivel) {
        super(nome, velocidadeMaxima, autonomia, tipoDeCombustivel);
    }

    @Override
    public void mover() {
        System.out.println("A bicicleta começou a se mover");
    }

    @Override
    public void parar() {
        System.out.println("A bicicleta começou a parar");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("A bicicleta " + getNome() + ", está a " + getVelocidadeMaxima() + "km");
        System.out.println("Tipo de combustível usavel: " + getTipoDeCombustivel());
    }
}
