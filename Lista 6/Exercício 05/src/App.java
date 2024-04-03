public class App {
    public static void main(String[] args) throws Exception {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            arrayHandle(i, array);
        }
    }
    
    public static void arrayHandle(int i, int [] array) {
        if(i%2 != 0) {
            array[i] = array[i]+20;
        } else {
            array[i] = array[i]+10;
        }
        
        System.out.println(array[i]); 
    }
}