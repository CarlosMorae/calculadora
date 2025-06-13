package animalEstimacao;

public class Cachorro extends Animal{
    private String raca;

    public Cachorro(String Nome, int Idade, String raca){
        super (Nome, Idade);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.println("Au, Au!");
    }

    @Override
    public void Comer() {
        System.out.println("O cachorro está comendo ração");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome() + ", Idade: " + getIdade() + " anos.");
        System.out.println("Raça: " + raca);
    }
}