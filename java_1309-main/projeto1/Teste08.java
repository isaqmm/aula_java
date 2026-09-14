import java.util.Scanner;

public class Teste08 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = teclado.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = teclado.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = teclado.nextInt();

        int menor = menorNumero(num1, num2, num3);

        System.out.println("O menor número é: " + menor);

        teclado.close();
    }

    public static int menorNumero(int num1, int num2, int num3) {

        int menor = num1;

        if (num2 < menor) {
            menor = num2;
        }

        if (num3 < menor) {
            menor = num3;
        }

        return menor;
    }
}