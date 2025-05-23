package GeometryDash;

public class FormaGeometrica {
    private String cor;

    public FormaGeometrica(String cor) {
        this.cor = cor;
    }
    public FormaGeometrica(){

    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double calcularArea() {
        System.out.println("Não implementado!");
        return 0.0;
    }

    public double calcularPerimetro() {
        System.out.println("Não implementado!");
        return 0.0;
    }

    public double calcularVolume() {
        System.out.println("Não implementado!");
        return 0.0;
    }
}
