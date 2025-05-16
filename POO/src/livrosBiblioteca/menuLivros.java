package livrosBiblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class menuLivros {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Lista dos livros
        ArrayList<Livros> livros = new ArrayList<>();

        //Titulo do livro e autor
        for (int contador = 0; contador <= 3; contador++) {
            Livros livro = new Livros();
            System.out.println("Digite o nome do título do livro");
            livro.setTituloLivro(scanner.next());
            System.out.println("Digite o autor do livro");
            livro.setAutorLivro(scanner.next());

            //Ano da publicação
            while (livro.getAnoPulicacao() < 1900) {
                System.out.println("O ano do livro não pode ser anterior que 1900");
                System.out.println("Digite o ano da publicação");
                livro.setAnoPulicacao(scanner.nextInt());
            }
        }
    }
}
