import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();

        int rows = 3;
        int cols = 3 ;
        int avgMain = 0;
        int avgSecondary = 0;
        int avg = 0;

        int[][] M = new int[rows][cols];        

        for (int i = 0 ; i < rows ; i++) {
            for (int j = 0; j < cols ; j++) {
                M[i][j] = random.nextInt(100);
            }
        }
        
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                if (i == j) {
                    avgMain += M[i][j];
                }
            }
        }

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                if (i == j-1) {
                    avgSecondary += M[i][j-1];
                }
            }
        }

        System.out.println(avgMain);
        avgSecondary = avgSecondary / M.length;
        System.out.println(avgSecondary);
        
        avg = avgMain * avgSecondary;
        System.out.println("Produto média da diagomnal principal com a secundária: ");
        System.out.println(avg);

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.print(M[i][j] + "\t");
            }
            System.out.println();
        }
    }
}