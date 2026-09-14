import java.util.Scanner;

public class Teste07 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = teclado.nextInt();

        exibirMensagem(num);

        teclado.close();
    }

    public static void exibirMensagem(int num) {

        if (num > 0) {
            System.out.println(num + " - Positivo");
        } else if (num < 0) {
            System.out.println(num + " - Negativo");
        } else {
            System.out.println(num + " - Zero");
        }
    }
}