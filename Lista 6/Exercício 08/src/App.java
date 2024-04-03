import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        int[] M = new int[10];
        int swap;

        for(int i = 0; i < M.length; i++) {
            System.out.println("Insira próximo valor para o array: ");
            M[i] = read.nextInt();
        }

        
        System.out.println("Resultado: " + Arrays.toString(M));

        for(int i = 0; i < 5; i++) {
            swap = M[i];
            M[i] = M[i + 5];
            M[i + 5] = swap;
        }

        System.out.println("Resultado após ordem trocada: " + Arrays.toString(M));
    }
}
