package GeometryDash;

import java.security.PrivateKey;

public class Circulo extends FormaGeometrica {
    private double Raio;
    private double Diametro;
    private double Circunferencia;

    public Circulo(String cor, double Raio, double Diametro, double Circunferencia) {
        super(cor);
        this.Raio = Raio;
        this.Diametro = Diametro;
        this.Circunferencia = Circunferencia;
    }

    public Circulo() {
    }

    public double getRaio() {
        return Raio;
    }

    public void setRaio(double raio) {
        Raio = raio;
    }

    public double getDiametro() {
        return Diametro;
    }

    public void setDiametro(double diametro) {
        Diametro = diametro;
    }

    public double getCircunferencia() {
        return Circunferencia;
    }

    public void setCircunferencia(double circunferencia) {
        Circunferencia = circunferencia;
    }

    @Override
    public double calcularPerimetro() {
        return (this.Raio + this.Diametro) * 2 * 3.14;
    }

    @Override
    public double calcularArea() {
        return this.Raio * this.Diametro;
    }

    @Override
    public double calcularVolume() {
        return (this.Raio * this.Diametro) * this.Circunferencia;
    }
}
