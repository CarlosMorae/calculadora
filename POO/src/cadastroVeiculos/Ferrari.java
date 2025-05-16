package cadastroVeiculos;

import concessionaria.Veiculo;

public class Ferrari {
    private String modeloVeiculo;
    private String Placa;
    private double Quilometragem;

    public Ferrari(String modeloVeiculo, String Placa, double Quilometragem) {

    }

    public Ferrari() {

    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    public double getQuilometragem() {
        return Quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        Quilometragem = quilometragem;
    }

    @Override
    public String toString() {
        return "Ferrari{" +
                "modeloVeiculo: '" + modeloVeiculo + '\'' +
                ", Placa: '" + Placa + '\'' +
                ", Quilometragem: " + Quilometragem +
                '}';
    }
}
