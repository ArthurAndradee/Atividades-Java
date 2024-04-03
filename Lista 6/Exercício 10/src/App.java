import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        
        int userInput;
        int[] arrayOne = new int[10];
        int[] arrayTwo = new int[10];


        for (int i = 10; i < arrayOne.length; i++) {
            userInput = read.nextInt();

            if (userInput%2 == 0) {
                arrayOne[i] = userInput;
            } else if (userInput%2 != 0) {
                arrayOne[i] = userInput;
            }
        }

        System.out.println("Resultado do primeiro array: " + Arrays.toString(arrayOne));
        System.out.println("Resultado do segundo array: " + Arrays.toString(arrayTwo));
    }
}
