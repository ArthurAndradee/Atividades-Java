import java.util.Random;

public class App {
    public static void main(String[] args) {
        int rows = 7;
        int cols = 9;

        int[][] matrix = new int[rows][cols];
        Random random = new Random();

        //Criação de matrix aleatória
        for (int i = 0 ; i < rows ; i++) {
            for (int j = 0; j < cols ; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }

        System.out.println("Matriz gerada aleatoriamente:");

        //Imprimindo matriz
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        //Realizando soma dos valores
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("A soma dos elementos da matriz é: " + sum);
    }
}