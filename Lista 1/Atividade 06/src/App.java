import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        System.out.println("Insira a temperatura");
        float temperaturaFahrenheit = read.nextFloat();

        float temperaturaCelsius = 5 * (temperaturaFahrenheit - 32) / 9;
        System.out.printf("Temperatura em Celsius: " + "%.1f", temperaturaCelsius);

        read.close();
    }
}
