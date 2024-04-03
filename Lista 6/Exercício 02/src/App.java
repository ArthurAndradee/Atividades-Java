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

        System.out.println("Insira um número");
        int number4 = read.nextInt();

        average(number1, number2, number3, number4);
    }

    public static void average(int number1, int number2, int number3, int number4) {
        float result = number1 + number2 + number3 + number4;
        result = result / 4;

        System.out.printf("Resultado: " + "%.2f", result);
    }
}