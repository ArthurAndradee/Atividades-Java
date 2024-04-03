import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        int[] X = new int[10];
        int[] Y = new int[10];
        
        arrayFunction(X, Y, read);
    }

    public static void arrayFunction(int [] X, int [] Y, Scanner read) {
        for(int i = 0; i < X.length ; i++) {
            System.out.println("insira o valor para os elementos do array: ");
            X[i] = read.nextInt();

            if (X[i]%2 == 0) {
                Y[i] = X[i] * 2;
            } else if (X[i]%2 != 0) {
                Y[i] = X[i] * 3;
            }
        }

        System.out.println("Vetor Y: " + Arrays.toString(Y));
    }
}