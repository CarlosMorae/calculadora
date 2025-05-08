package GeometryDash;

public class Rentangulo extends FormaGeometrica {
    private double largura;
    private double altura;
    private double comprimento;

    public Rentangulo(String cor, double largura, double altura, double comprimento) {
        super(cor);
        this.largura = largura;
        this.altura = altura;
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public double calcularVolume() {
        return (this.largura * this.comprimento) * this.altura;
    }

    @Override
    public double calcularPerimetro() {
        return (this.largura + this.altura) * 2;
    }

    @Override
    public double calcularArea() {
        return this.largura * this.altura;
    }
}
