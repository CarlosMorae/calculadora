package Funcionarios;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public void exibirCargo() {
        System.out.println("Desenvolvedor");
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.15;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("O desenvolvedor " + getNome() + ", recebeu R$: " + getSalario() + " reais");
        System.out.println("Um bônus de 15% foi acrescentado: " + calcularBonus());
    }
}
