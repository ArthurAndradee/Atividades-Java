import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int rows = 10;
        int cols = 10;

        int[][] matrix = new int[rows][cols];
        Random random = new Random();

        //Criação de matrix aleatória
        for (int i = 0 ; i < rows ; i++) {
            for (int j = 0; j < cols ; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }

        int[] evenRowSums = new int[matrix.length / 2]; // vetor para armazenar a soma das linhas pares

        for (int i = 0; i < matrix.length; i += 2) { // itera apenas pelas linhas pares
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            evenRowSums[i / 2] = sum; // armazena a soma da linha par i no vetor
        }
        
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Linha " + (2 * i) + ": " + evenRowSums[i]);
        }
    }
}