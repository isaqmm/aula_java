import java.util.Scanner;

public class Teste09 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a idade do atleta: ");
        int idade = teclado.nextInt();

        System.out.print("Digite o peso do atleta: ");
        double peso = teclado.nextDouble();

        exibirMensagem(idade, peso);

        teclado.close();
    }

    public static void exibirMensagem(int idade, double peso) {

        if (idade <= 14) {

            System.out.println("Categoria: Infantil");

        } else if (idade >= 15 && idade <= 17) {

            if (peso <= 50) {
                System.out.println("Categoria: Juvenil leve");
            } else {
                System.out.println("Categoria: Juvenil pesado");
            }

        } else if (idade >= 18 && idade <= 25) {

            if (peso <= 60) {
                System.out.println("Categoria: Senior leve");
            } else {
                System.out.println("Categoria: Senior pesado");
            }

        } else {

            System.out.println("Categoria: Veterano");
        }
    }
}