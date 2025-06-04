package animaisEstimacao;

public class Gato extends Animal{
    private String pelo;

    public Gato(String Nome, int Idade, String pelo){
        super(Nome, Idade);
        this.pelo = pelo;
    }

    public String getPelo() {
        return pelo;
    }

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau, Miau!");
    }

    @Override
    public void Comer() {
        System.out.println("O gato está comendo peixe");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome() + ", Idade: " + getIdade() + "anos.");
        System.out.println("Pelo: " + pelo);
    }
}