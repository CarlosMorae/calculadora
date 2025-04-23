package atividadeDois;

public class Paciente {
    private String Nome;
    private String CPF;
    private String Email;

    public Paciente(String Nome, String CPF, String email) {
    }

    public Paciente() {
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "Nome='" + Nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}
