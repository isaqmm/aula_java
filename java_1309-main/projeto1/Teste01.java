import java.util.Scanner;

public class Teste01 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double n = teclado.nextDouble();

        // a)
        if (n > 0) {
            double raiz = Math.sqrt(n);
            System.out.println("Raiz quadrada: " + raiz);
        }

        // b)
        System.out.print("Digite a média do aluno: ");
        double media = teclado.nextDouble();

        if (media >= 6.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Precisa grau C");
        }

        // c)
        System.out.print("Digite x: ");
        int x = teclado.nextInt();

        System.out.print("Digite y: ");
        int y = teclado.nextInt();

        System.out.print("Digite z: ");
        int z = teclado.nextInt();

        int r = 0;

        if (x > y) {
            if (x > z) {
                if (y != z) {
                    r = 1;
                }
            }
        }

        System.out.println("r = " + r);

        // d)
        r = 0;

        if (x > y) {
            if (x > z) {
                if (y != z) {
                    r = 1;
                } else {
                    r = 2;
                }
            }
        }

        System.out.println("r = " + r);

        teclado.close();
    }
}