import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        System.out.println("Insira o primeiro segmento: ");
        int a = read.nextInt();

        System.out.println("Insira o segundo segmento: ");
        int b = read.nextInt();

        System.out.println("Insira o terceiro segmento: ");
        int c = read.nextInt();

        if (a < b + c && b < c + a && c < a + b) {
            System.out.println("Triângulo existe!");
            
            if (a == b || b == c || c == a) {
                System.out.println("Triângulo é isósceles");
            } else if (a != b && b != c && c != a) {
                System.out.println("Triângulo é escaleno");
            } else if (a == b && b == c) {
                System.out.println("Triângulo é equilátero");
            }
        } else {
            System.out.println("Triângulo não existe.");
        }

        read.close();
    }
}
