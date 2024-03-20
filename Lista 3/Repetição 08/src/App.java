public class App {
    public static void main(String[] args) {
        int count = 0;
        int number = 101; 

        while (count < 50) {
            if (isPrime(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }

    public static boolean isPrime(int num) {

        if (num <= 1)
            return false;
        if (num <= 3)
            return true;
        if (num % 2 == 0 || num % 3 == 0)
            return false;

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0)
                return false;
        }
        return true;
    }
}