import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int rows = 5;
        int cols = 5;

        int[][] matrixOne = new int[rows][cols];
        int[][] matrixTwo = new int[rows][cols];
        Random random = new Random();

        for (int i = 0 ; i < rows ; i++) {
            for (int j = 0; j < cols ; j++) {
                matrixOne[i][j] = random.nextInt(100);
                matrixTwo[i][j] = random.nextInt(100);
            }
        }

        //Realizando soma dos dois arrays
        int sum = 0;
        for (int i = 0; i < matrixOne.length; i++) {
            for (int j = 0; j < matrixOne[i].length; j++) {
                sum += matrixOne[i][j] + matrixTwo[i][j];
            }
        }
        System.out.println("A soma dos elementos da matriz é: " + sum);
    }
}