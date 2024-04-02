import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        System.out.println("Insira um número");
        float number = read.nextFloat();
        
        if (number > 100) {
            System.out.println("Number is bigger than 100");
        } else {
            System.out.println("Number is not bigger than 100");
        }
        
        read.close();
    }
}