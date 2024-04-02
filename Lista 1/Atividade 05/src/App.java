import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        System.out.println("Insira o raio do círculo");
        float raio = read.nextFloat();

        float pi = (float) 3.141592;
        float result = pi * (raio * raio);

        System.out.printf("Área do círculo: " + "%.2f", result);

        read.close();
    }
}
