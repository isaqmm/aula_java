import java.util.Scanner;

public class Teste02 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        int a = teclado.nextInt();

        System.out.print("Digite o valor de b: ");
        int b = teclado.nextInt();

        System.out.print("Digite o valor de c: ");
        int c = teclado.nextInt();

        int guarda;

        if (a < b) {
            System.out.println("IF 1 executado");
            guarda = a;
            a = b;
            b = guarda;
        }

        if (b < c) {
            System.out.println("IF 2 executado");

            guarda = b;
            b = c;
            c = guarda;

            if (a < b) {
                System.out.println("IF 3 executado");

                guarda = a;
                a = b;
                b = guarda;
            }
        }

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        teclado.close();
    }
}