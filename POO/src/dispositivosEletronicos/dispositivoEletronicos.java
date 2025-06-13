package dispositivosEletronicos;

public abstract class dispositivoEletronicos {
    private String Marca;
    private String Modelo;
    private boolean Ligado = false;

    public dispositivoEletronicos(String Marca, String Modelo) {
        this.Marca = Marca;
        this.Modelo = Modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public boolean isLigado() {
        return Ligado;
    }

    public void setLigado(boolean ligado) {
        Ligado = true;
        System.out.println("O dispositivo " + Marca+ " " + Modelo + "está ligado.");
    }
    public void Desligar(){
        Ligado = false;
        System.out.println("O dispositivo " + Marca + " " + Modelo + "está desligado.");
    }
    public abstract void executarFuncaoPrincipal();
    public abstract void exibirStatus();
}
