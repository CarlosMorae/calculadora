package dispositivosEletronicos;

public class Smartphone extends dispositivoEletronicos {
    private String sistemaOperacional;

    public Smartphone(String Marca, String Modelo, String sistemaOperacional) {
        super(Marca, Modelo);
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public void executarFuncaoPrincipal() {
        if (isLigado()) {
            System.out.println("Ligando o smartphone");
        } else {
            System.out.println("Não é possível ligar o celular, smartphone está desligado");
        }

    }

    @Override
    public void exibirStatus() {
        System.out.println("Smartphone " + getMarca() + " " + getModelo() + "-SO: " + sistemaOperacional + "- Estado: " + (isLigado() ? "Ligado" : "Desligado"));
    }
}