import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        int[] array = new int[10];
        int result = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Insira próximo valor no array");

            array[i] = read.nextInt();
        }

        System.out.println("Escolha a opção desejada: \n1. Soma dos elementos\n2. Produto dos elementos\n3. Média dos elementos\n4. Mostre o vetor");
        int userInput = read.nextInt();

        switch (userInput) {
            case 1:
                for(int value : array) {
                    result += value;
                }
                break;

            case 2:
                result = 1;
                for(int i = 0; i < 10 ; i++) {
                    result = result * array[i];
                }
                break;

            case 3:
                for(int value : array) {
                    result += value;
                }
                result = result / array.length;
                break;

            case 4:
                System.out.println("Valores do Array: " + Arrays.toString(array));
                break;
        
            default:
                break;
        }

        System.out.println("Resultado solicitado: " + result);
    }
}
