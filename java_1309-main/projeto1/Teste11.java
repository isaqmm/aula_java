import java.util.Scanner;

public class Teste11 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = teclado.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = teclado.nextInt();

        realizarCalculo(a, b);

        teclado.close();
    }

    public static void realizarCalculo(int a, int b) {

        Scanner teclado = new Scanner(System.in);

        int resultado;

        System.out.println("========== MENU ==========");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        System.out.print("Qual operação deseja realizar? ");
        int op = teclado.nextInt();

        switch (op) {

            case 1:
                resultado = a + b;
                System.out.println("O resultado da adição é: " + resultado);
                break;

            case 2:
                resultado = a - b;
                System.out.println("O resultado da subtração é: " + resultado);
                break;

            case 3:
                resultado = a * b;
                System.out.println("O resultado da multiplicação é: " + resultado);
                break;

            case 4:
                if (b != 0) {
                    resultado = a / b;
                    System.out.println("O resultado da divisão é: " + resultado);
                } else {
                    System.out.println("Não é possível dividir por zero.");
                }
                break;

            default:
                System.out.println("Opção inválida!");
        }

        teclado.close();
    }
}