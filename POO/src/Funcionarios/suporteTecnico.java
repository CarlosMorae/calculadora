package Funcionarios;

public class suporteTecnico extends Funcionario{
    public suporteTecnico(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public void exibirCargo() {
        System.out.println("Suporte Técnico");
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.08;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("O suporte técnico " + getNome() + ", recebeu R$: " + getSalario() + " reais");
        System.out.println("Um bônus de 8% foi acrescentado: " + calcularBonus());
    }
}
