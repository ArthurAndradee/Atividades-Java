import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        int number = read.nextInt();

        for(int i = 1; i <= number; i++) {
            System.out.println(i * number);
            int userInput = read.nextInt();
            if (userInput == 0) {
                i = number;
            }
        }

        read.close();
    }
}
