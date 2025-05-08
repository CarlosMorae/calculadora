package Celular;

public class Celular { //Atributos
    private String marca;
    private String modelo;
    private double preco;
    private long memoria;

    public Celular(String marca, String modelo, double preco, long memoria) {
    }

    public Celular() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public long getMemoria() {
        return memoria;
    }

    public void setMemoria(long memoria) {
        this.memoria = memoria;
    }
    @Override
    public String toString() {
        return "Celular{" +
                "marca:'" + marca + '\'' +
                ", modelo:'" + modelo + '\'' +
                ", preco:" + preco +
                ", memoria:" + memoria +
                '}';
    }
}
