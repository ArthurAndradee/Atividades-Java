import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        System.out.println("Insira seu número: ");
        int numero = read.nextInt();

        if (numero > 100) {
            System.out.println("Número inserido é maior que 100");
        } else {
            System.out.println("Número inserido não é maior que 100");
        }

        read.close();
    }
}
