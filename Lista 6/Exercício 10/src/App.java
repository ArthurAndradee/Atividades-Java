import java.util.Random;

public class App {
    public static void main(String[] args) {
        int rows = 7;
        int cols = 9;

        int[][] matrix = new int[rows][cols];
        
        createRandomMatrix(matrix, rows, cols);

        printMatrix(matrix);

        int[] C = findNegativeValues(matrix);

        printArray(C);
    }

    public static int[][] createRandomMatrix(int[][] matrix, int rows, int cols) {
        Random random = new Random();
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(300) - 100; // Gera números aleatórios entre 0 e 99
            }
        }

        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Matriz gerada aleatoriamente:");
    }
    
    public static int[] findNegativeValues(int[][] matrix) {
        int[] C = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    count++;
                }
            }
            C[i] = count;
        }

        return C;
    }

    public static void printArray(int[] C) {
        System.out.println("Quantidade de elementos negativos em cada linha:");
        for (int i = 0; i < C.length; i++) {
            System.out.println("Linha " + (i + 1) + ": " + C[i] + " elementos negativos");
        }
    }
}