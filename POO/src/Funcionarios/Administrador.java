package Funcionarios;

public class Administrador extends Funcionario{
    public Administrador(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public void exibirCargo() {
        System.out.println("Administrador");
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.10;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("O administrador " + getNome() + ", recebeu R$: " + getSalario() + " reais");
        System.out.println("Um bônus de 10% foi acrescentado: " + calcularBonus());
    }
}
