import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        System.out.println("Insira seu número entre 100 e 200: ");
        int numero = read.nextInt();

        if (numero >= 100 && numero <= 200) {
            System.out.println("Ok!");
        } else {
            System.out.println("Número inválido");
        }

        read.close();
    }
}
