import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        System.out.println("Insira quantas laranjas você comprará: ");
        int quantidadeLaranjas = read.nextInt();

        double precoLaranjas = 0;

        if (quantidadeLaranjas >= 12) {
            precoLaranjas = quantidadeLaranjas * 0.25;
        } else {
            precoLaranjas = quantidadeLaranjas * 0.30;
        }

        System.out.printf("Preço das laranjas: " + precoLaranjas);
        read.close();
    }
}
