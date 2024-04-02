import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        System.out.println("Insira quantos homens estarão: ");
        int homens = read.nextInt();

        System.out.println("Insira quantas mulheres estarão: ");
        int mulheres = read.nextInt();

        System.out.println("Insira quantas crianças estarão: ");
        int criancas = read.nextInt();

        float totalDeCarneNecessaria = homens * 650 + mulheres * 420 + criancas * 290;
        System.out.printf("Quantidade de carne necessária: " + totalDeCarneNecessaria);

        read.close();
    }
}
