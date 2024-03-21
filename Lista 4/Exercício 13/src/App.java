import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[5];

        for (int i = 0; i < A.length; i++) {
            System.out.println("Insira " + (i+1) + "o valor do array A");
            A[i] = read.nextInt();
            
            System.out.println("Insira " + (i+1) + "o valor do array B"); 
            B[i] = read.nextInt();

            if (A[i] == B[i]) {
                C[i] = A[i];
            }
        }

        for (int i = 0; i < C.length; i++) {
            if (C[i] != 0) {
                System.out.println("Resultado em comum entre A e B: " + C[i]);
            }
        }
    }
}