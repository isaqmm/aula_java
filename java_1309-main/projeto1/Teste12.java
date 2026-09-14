import java.util.Scanner;

public class Teste12 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = teclado.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = teclado.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = teclado.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Média: " + media);

        if (media >= 0 && media < 4) {
            System.out.println("Nota E");

        } else if (media < 5) {
            System.out.println("Nota D");

        } else if (media < 7) {
            System.out.println("Nota C");

        } else if (media < 8) {
            System.out.println("Nota B");

        } else if (media <= 10) {
            System.out.println("Nota A");
        }

        teclado.close();
    }
}