import java.util.Scanner;

public class Teste06 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o turno [M-manhã / T-tarde / N-noite]: ");
        char turno = teclado.next().charAt(0);

        turno = Character.toUpperCase(turno);

        switch (turno) {

            case 'M':
                System.out.println("bom dia");
                break;

            case 'T':
                System.out.println("boa tarde");
                break;

            case 'N':
                System.out.println("boa noite");
                break;

            default:
                System.out.println("turno inválido");
        }

        teclado.close();
    }
}