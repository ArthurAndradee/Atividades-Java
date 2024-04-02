import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        System.out.println("Insira a quantidade de eleitores: ");
        int eleitores = read.nextInt();

        System.out.println("Insira a quantidade de votos válidos: ");
        int votosValidos = read.nextInt();

        System.out.println("Insira a quantidade de votos brancos: ");
        int votosBrancos = read.nextInt();

        System.out.println("Insira a quantidade de votos nulos: ");
        int votosNulos = read.nextInt();

        int x = (votosValidos * 100) / eleitores;
        System.out.println("Porcentagem de votos válidos: " + x + "%");

        x = (votosBrancos * 100) / eleitores;
        System.out.println("Porcentagem de votos brancos: " + x + "%");

        x = (votosNulos * 100) / eleitores;
        System.out.println("Porcentagem de votos nulos: " + x + "%");

        read.close();
    }
}
