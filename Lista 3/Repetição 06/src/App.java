import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        System.out.println("Insira seu número: ");
        int number = read.nextInt();

        do {
            System.out.println("Tabuada do número");
            System.out.println("x1 número: " + number * 1);
            System.out.println("x2 número: " + number * 2);
            System.out.println("x3 número: " + number * 3);
            System.out.println("x4 número: " + number * 4);
            System.out.println("x5 número: " + number * 5);
            System.out.println("x6 número: " + number * 6);
            System.out.println("x7 número: " + number * 7);
            System.out.println("x8 número: " + number * 8);
            System.out.println("x9 número: " + number * 9);
            System.out.println("x10 número: " + number * 10);

            System.out.println("Insira próximo número");
            number = read.nextInt();
        } while (number > 0);
    }
}
