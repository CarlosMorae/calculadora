package animaisEstimacao;

public abstract class Animal {
    private String Nome;
    private int Idade;

    public Animal(String Nome, int Idade) {
        this.Nome = Nome;
        setIdade(Idade);
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        if (Idade < 0) {
            this.Idade = idade;
        } else {
            System.out.println("Idade não pode ser negativa");
        }
    }

    public abstract void emitirSom();

    public abstract void Comer();

    public abstract void exibirInformacoes();
}
