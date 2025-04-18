package Emprestimo;

import java.util.Scanner;

public class Emprestimo {
    private double valor;
    private String dataDeEmprestimo;
    private int numeroDeParcelas;

    public Emprestimo(double valor, String dataDeEmprestimo, int numeroDeParcelas){
    }
    public Emprestimo(){
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataDeEmprestimo() {
        return dataDeEmprestimo;
    }

    public void setDataDeEmprestimo(String dataDeEmprestimo) {
        this.dataDeEmprestimo = dataDeEmprestimo;
    }

    public int getNumeroDeParcelas() {
        return numeroDeParcelas;
    }

    public void setNumeroDeParcelas(int numeroDeParcelas) {
        this.numeroDeParcelas = numeroDeParcelas;
    }
    @Override
    public String toString() {
        return "Emprestimo{" +
                "valor=" + valor +
                ", dataDeEmprestimo='" + dataDeEmprestimo + '\'' +
                ", numeroDeParcelas=" + numeroDeParcelas +
                '}';
    }
}
