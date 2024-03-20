import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];

        for (int i = 0; i < A.length; i++) {
            System.out.println("Insira " + (i+1) + "o valor do array A");
            A[i] = read.nextInt();
            System.out.println("Insira " + (i+1) + "o valor do array B"); 
            B[i] = read.nextInt();

            C[i] = A[i] + B[i];
        }

        System.out.println("Resultado: " + Arrays.toString(C));
    }
}