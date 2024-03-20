import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        int userInput = 0;
        int maleAge = 0;
        int femaleAge = 0;


        String gender = "M";

        do {
            System.out.println("Insira qual sexo (M/F): ");
            gender = read.next();

            if(gender.equals("M")) {
                System.out.println("Insira a idade atribuída: ");
                userInput = read.nextInt();

                maleAge = maleAge + userInput;
            } else if (gender.equals("F")) {
                System.out.println("Insira a idade atribuída: ");
                userInput = read.nextInt();

                femaleAge = femaleAge + userInput;
            }

            System.out.println("Idade de M: " + maleAge);
            System.out.println("Idade de F: " + femaleAge);
        } while (gender.equals("M") || gender.equals("F"));
    }
}
