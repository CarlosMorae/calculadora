package dispositivosEletronicos;

public class Televisão extends dispositivoEletronicos{
    private int tamanhoPolegadas;

    public Televisão(String Marca, String Modelo, int tamanhoPolegadas){
        super(Marca, Modelo);
        this.tamanhoPolegadas = tamanhoPolegadas;
    }

    public int getTamanhoPolegadas() {
        return tamanhoPolegadas;
    }

    public void setTamanhoPolegadas(int tamanhoPolegadas) {
        this.tamanhoPolegadas = tamanhoPolegadas;
    }

    @Override
    public void executarFuncaoPrincipal() {
        if (isLigado()){
            System.out.println("Ligando a televisão");
        }else {
            System.out.println("Não é possível ligar o dispositivo, televisão está desligada");
        }
    }

    @Override
    public void exibirStatus() {
        System.out.println("Televisão " + getMarca() + " " + getModelo() + "-tamanho: " + tamanhoPolegadas + "polegadas - Estado: " + (isLigado() ? "Ligado" : "Desligado"));
    }
}