import java.util.Scanner;

public class ComandosBasicos {
    //static == const
     static Scanner sc = new Scanner(System.in); //prompt - receber a mensagem

    public static void main(String[] args) {
        //Variaveis de tipos primitivos
        boolean TrueOFFalse = true;
        int numerosReais = 0; // 10000000000 a -100000000000
        double decimais = 0.2; // 100000.200 a -100000.400
        char letra = 'A';

        //Variavel tipo Objeto
        String texto = "Texto";
        Integer numerosReais2 = 2; // Inteiro do tipo Objeto
        Double decimais2 = 0.2; //Decimal do tipo Objeto

        String nome = null; // nulo == ""
        String sexo = "";

        System.out.println("Qual o seu nome?"); //Escreva no terminal - para o usuario
        nome = sc.nextLine(); //Leia - Escreva na variavel nome

        System.out.println("O seu nome é: " + nome);


    }
}
