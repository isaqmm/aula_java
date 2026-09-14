import java.util.Scanner;

public class Teste04 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("A é true ou false? ");
        boolean a = teclado.nextBoolean();

        System.out.print("B é true ou false? ");
        boolean b = teclado.nextBoolean();

        System.out.print("C é true ou false? ");
        boolean c = teclado.nextBoolean();

        System.out.println("Resultado:");

        if (a) {

            if (b) {

                System.out.println("C1");

                if (c) {
                    System.out.println("C2");
                    System.out.println("C3");
                } else {
                    System.out.println("C4");
                }

            } else {
                System.out.println("C5");
            }

        } else {
            System.out.println("C6");
        }

        teclado.close();
    }
}