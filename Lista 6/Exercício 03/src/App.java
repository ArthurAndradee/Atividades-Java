import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        System.out.println("Insira seu número: ");
        int numero = read.nextInt();

        isNumberEven(numero);
    }

    public static void isNumberEven(int numero) {
        if (numero % 2 == 0) {
            System.out.println("Número inserido é par");
        } else {
            System.out.println("Número inserido é ímpar");
        }
    }
}