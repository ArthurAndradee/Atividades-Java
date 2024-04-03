import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int rows = 5;
        int cols = 5;

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
        int[] columnSums = new int[matrix[0].length]; // vetor para armazenar a soma de cada coluna

        for (int j = 0; j < matrix[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][j];
            }
            columnSums[j] = sum; // armazena a soma da coluna j no vetor
        }
        
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Coluna " + (i + 1) + ": " + columnSums[i]);
        }
    }
}