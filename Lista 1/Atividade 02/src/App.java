import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        System.out.println("Insira um número");
        int number1 = read.nextInt();

        System.out.println("Insira um número");
        int number2 = read.nextInt();

        System.out.println("Insira um número");
        int number3 = read.nextInt();

        int result = number1 + number2 + number3;
        System.out.println("Resultado: " + result);

        read.close();
    }
}
