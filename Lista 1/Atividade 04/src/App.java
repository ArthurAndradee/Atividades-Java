import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        System.out.println("Insira um número");
        int number = read.nextInt();
        System.out.println("Conteúdo é: " + number);

        int quadrado = number * number;
        System.out.println("Quadrado é: " + quadrado);

        int divisao = number / 3;
        System.out.println("Divisão inteira por 3 é: " + divisao);

        float metade = number / 2;
        System.out.println("Metade é: " + metade);

        int produtoMetade = number * number;

        // Divisor metade do número
        number = number / 2;

        // Operação de divisão
        produtoMetade = produtoMetade / number;
        System.out.println("Produto do número dividido pela sua metade é: " + produtoMetade);

        read.close();
    }
}
