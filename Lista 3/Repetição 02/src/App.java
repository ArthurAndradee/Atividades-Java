import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        
        int firstNumber = read.nextInt();
        int secondNumber = read.nextInt();
        int sum = 0;

        if (firstNumber < secondNumber && firstNumber < 0) {
            for (int i = firstNumber; i <= secondNumber; i++) {
                if(i%5 == 0) {
                    System.out.println("Número divisível por 5: " + i);

                    sum  = sum + i;
                }
            }
            System.out.println("Soma dos divisíveis: " + sum);
        }

        read.close();
    }
}
