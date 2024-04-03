import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int[] array = new int[30];


        //Gerar valores aleatórios para as 30 posições do array
        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                System.out.println("Posição " + i + "o está o número: " + array[i]);
            }
        }
    }
}
