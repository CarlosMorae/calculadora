package animalEstimacao;

public class Passaro extends Animal{
    private String corPenas;

    public Passaro(String Nome, int Idade, String corPenas){
        super(Nome, Idade);
        this.corPenas = corPenas;
    }

    public String getCorPenas() {
        return corPenas;
    }

    public void setCorPenas(String corPenas) {
        this.corPenas = corPenas;
    }

    @Override
    public void emitirSom() {
        System.out.println("Piu, Piu!");
    }

    @Override
    public void Comer() {
        System.out.println("O passaro está comendo sementes");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome() + ", Idade: " + getIdade() + " anos");
        System.out.println("Cor de penas: " + corPenas);
    }
}