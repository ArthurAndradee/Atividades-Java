import java.util.Random;

public class App {
    public static void main(String[] args) {
        int rows = 7;
        int cols = 9;

        int[][] matrix = new int[rows][cols];

        createRandomMatrix(matrix, rows, cols);

        printMatrix(matrix);

        printMatrixSum(matrix);
    }

    public static int[][] createRandomMatrix(int[][] matrix, int rows, int cols) {
        Random random = new Random();
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(100); // Gera números aleatórios entre 0 e 99
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

    public static void printMatrixSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("A soma dos elementos da matriz é: " + sum);
    } 
}