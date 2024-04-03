import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();

        int rows = 5;
        int cols = 5;
        int sum = 0;

        int[][] M = new int[rows][cols];        

        for (int i = 0 ; i < rows ; i++) {
            for (int j = 0; j < cols ; j++) {
                M[i][j] = random.nextInt(100);
            }
        }

        for (int i = 0; i < M.length; i++) {
            sum += M[3][i];
        }
        System.out.println("Soma da linha 4: ");
        System.out.println(sum);
        sum = 0;

        for (int i = 0; i < M.length; i++) {
            sum += M[i][1];
        }
        System.out.println("Soma da coluna 2: ");
        System.out.println(sum);
        sum = 0;
        
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                if (i == j) {
                    sum += M[i][j];
                }
            }
        }
        System.out.println("Soma da diagomnal principal: ");
        System.out.println(sum);
        

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.print(M[i][j] + "\t");
            }
            System.out.println();
        }
    }
}