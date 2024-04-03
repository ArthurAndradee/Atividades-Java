import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Insira próximo valor no array");

            array[i] = read.nextInt();
        }

        Arrays.sort(array);

        System.out.println("Resultado do primeiro array: " + Arrays.toString(array));
    }
}
