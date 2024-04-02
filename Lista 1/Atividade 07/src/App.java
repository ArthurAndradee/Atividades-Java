import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        System.out.println("Insira a quantidade de polegadas: ");
        float polegadas = read.nextFloat();

        float valorConversao = (float) 25.4;
        float comprimento = polegadas * valorConversao;

        System.out.printf("Comprimento em mm: " + comprimento);

        read.close();
    }
}
