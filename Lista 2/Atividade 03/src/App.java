import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        System.out.println("Insira seu primeiro número: ");
        int numero = read.nextInt();

        System.out.println("Insira seu segundo número: ");
        int numero2 = read.nextInt();

        if (numero > numero2) {
            System.out.println("Primeiro número é maior que o segundo");
        } else {
            System.out.println("Segundo número é maior que o primeiro");
        }

        read.close();
    }
}
