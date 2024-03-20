public class App {
    public static void main(String[] args) throws Exception {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i]+10 * i;
            System.out.println(array[i]);
        }
    }
}
