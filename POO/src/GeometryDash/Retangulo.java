package GeometryDash;

public class Retangulo extends FormaGeometrica {
    private double largura;
    private double altura;
    private double comprimento;

    public Retangulo(String cor, double largura, double altura, double comprimento) {
        super(cor); // Construtor da classe pai (forma geometrica)
        this.largura = largura;
        this.altura = altura;
        this.comprimento = comprimento;
    }

    public Retangulo() {
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public double calcularPerimetro() {
        return (this.largura + this.altura) * 2;
    }

    @Override
    public double calcularArea() {
        return this.largura * this.altura;
    }

    @Override
    public double calcularVolume() {
        return (this.largura * this.comprimento) * this.altura;
    }
}
