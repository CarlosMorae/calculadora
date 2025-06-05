package dispositivosEletronicos;

public class Notebook extends dispositivoEletronicos{
    private int memoriaRam;

    public Notebook(String Marca, String Modelo, int memoriaRam){
        super(Marca, Modelo);
        this.memoriaRam = memoriaRam;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    @Override
    public void executarFuncaoPrincipal() {
        if (isLigado()) {
            System.out.println("Ligando o notebook");
        } else {
            System.out.println("Não é possível ligar o dispositivi, notebook está desligado ");
        }
    }

    @Override
    public void exibirStatus() {
            System.out.println("Notebook " + getMarca() + " " + getModelo() + "-Memória RAM" + memoriaRam + "GB - Estado: " + ((isLigado()) ? "Ligado" : "Desligado"));
        }
}
