import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int rows = 10;
        int cols = 10;
        int avg = 0;

        int[][] M = generateRandomMatrix(rows, cols);
        
        findDiagonalAverage(avg, M);

        printMatrix(M);
    }

    public static int [][] generateRandomMatrix(int rows, int cols) {

        Random random = new Random();

        int[][] M = new int[rows][cols];      

        for (int i = 0 ; i < rows ; i++) {
            for (int j = 0; j < cols ; j++) {
                M[i][j] = random.nextInt(100);
            }
        }

        return M;
    }

    public static void findDiagonalAverage(int avg, int[][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                if (i == j) {
                    avg += M[i][j];
                }
            }
        }

        avg = avg / M.length;

        System.out.println("Média da diagomnal principal: ");
        System.out.println(avg);
    }

    public static void printMatrix(int[][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.print(M[i][j] + "\t");
            }
            System.out.println();
        }
    }
}