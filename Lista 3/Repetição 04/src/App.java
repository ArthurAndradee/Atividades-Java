import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        int firstNumber = 0;
        int secondNumber = 0;

        do {
            firstNumber = read.nextInt();
            secondNumber = read.nextInt();

            if (firstNumber < secondNumber) {
                System.out.println("Valores foram dados em ordem crescente");
            } else if (firstNumber > secondNumber){
                System.out.println("Valores foram dados em ordem decrescente");
            }

        } while (firstNumber != secondNumber);

        read.close();
    }
}
