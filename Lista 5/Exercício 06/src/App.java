import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Insira valor de A:");
        int A = read.nextInt();

        int rows = 6;
        int cols = 6;

        int[][] matrix = new int[rows][cols];        

        for (int i = 0 ; i < rows ; i++) {
            for (int j = 0; j < cols ; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }

        //Realizando soma dos dois arrays
        int[][] V = new int[rows][cols];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                V[i][j] = matrix[i][j] * A;
            }
        }

        for (int i = 0; i < V.length; i++) {
            for (int j = 0; j < V[i].length; j++) {
                System.out.print(V[i][j] + "\t");
            }
            System.out.println();
        }
    }
}