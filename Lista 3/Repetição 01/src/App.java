import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner (System.in);
        int evenResult = 0;
        int unevenResult = 0;

        int number = read.nextInt();

        for(int i = 0; i <= number; i++) {
            System.out.println(i);

            if(i%2 == 0) {
                evenResult = evenResult + i;
            } else if (i%2 != 0) {
                unevenResult = unevenResult + i;
            }
        }

        System.out.println("Soma dos pares é: " + evenResult);
        System.out.println("Soma dos ímpares é: " + unevenResult);

        read.close();
    }
}
