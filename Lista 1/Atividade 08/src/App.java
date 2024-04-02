import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        System.out.println("Insira as horas passadas: ");
        int horas = read.nextInt();

        System.out.println("Insira os minutos passados: ");
        int minutos = read.nextInt();

        System.out.println("Insira os segundos passados: ");
        int segundos = read.nextInt();

        float totalDeSegundos = (horas * 60 * 60) + (minutos * 60) + segundos;
        System.out.printf("Segundos decorridos: " + totalDeSegundos);

        read.close();
    }
}
