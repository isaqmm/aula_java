import java.util.Scanner;

public class Teste10 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome da 1ª pessoa: ");
        String nome1 = teclado.nextLine();

        System.out.print("Digite a idade da 1ª pessoa: ");
        int idade1 = teclado.nextInt();

        teclado.nextLine();

        System.out.print("Digite o nome da 2ª pessoa: ");
        String nome2 = teclado.nextLine();

        System.out.print("Digite a idade da 2ª pessoa: ");
        int idade2 = teclado.nextInt();

        Pessoa p1 = new Pessoa(nome1, idade1);
        Pessoa p2 = new Pessoa(nome2, idade2);

        System.out.println("Pessoa mais velha: " + compararIdades(p1, p2));

        teclado.close();
    }

    public static String compararIdades(Pessoa pessoa1, Pessoa pessoa2) {

        if (pessoa1.getIdade() > pessoa2.getIdade()) {
            return pessoa1.getNome();

        } else if (pessoa1.getIdade() < pessoa2.getIdade()) {
            return pessoa2.getNome();

        } else {
            return "Mesma idade";
        }
    }
}