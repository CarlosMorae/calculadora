package animalEstimacao;

public class Gato extends Animal{
    private String corPelo;

    public Gato(String Nome, int Idade, String corPelo){
        super (Nome, Idade);
        this.corPelo = corPelo;
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void emitirSom() {
        System.out.println("Miua, Miau!");
    }

    @Override
    public void Comer() {
        System.out.println("O gato está comendo peixe");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome() + ", Idade: " + getIdade() + " anos");
        System.out.println("Cor de pelo: " + corPelo);
    }
}
