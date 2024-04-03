import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        System.out.println("Insira um número");
        int number = read.nextInt();
        
        isNumberBiggerThan100(number);
    }

    public static void isNumberBiggerThan100(int number) {
        if (number > 100) {
            System.out.println("Number is bigger than 100");
        } else {
            System.out.println("Number is not bigger than 100");
        }
    }
}