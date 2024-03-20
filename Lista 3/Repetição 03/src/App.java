import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        int sum = 0;

        int inputNumber = read.nextInt();
        
        for(int i = 1; i < inputNumber; i++) {
            if (inputNumber % i == 0) {
                sum += i;
            }
        }

        if(sum == inputNumber) {
            System.out.println("lol number is perfect");
        } else {
            System.out.println("lol number is not perfect");
        }

        read.close();
    }
}
