public class App {
    public static void main(String[] args) throws Exception {
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {

            if(i%2 == 0) {
                array[i] = array[i];
            }
            
            System.out.println(array[i]); 
        }
    }
}
