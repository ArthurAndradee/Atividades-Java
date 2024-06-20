import java.util.Scanner;

public class TestaCD {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        System.out.print("Informe o número de músicas do CD: ");
        int numeroDeMusicas = read.nextInt();

        CD cd = new CD(numeroDeMusicas);

        int comando;

        do {
            System.out.println("\nMenu de Opções:");
            System.out.println("1 - Play");
            System.out.println("2 - Pause");
            System.out.println("3 - Stop");
            System.out.println("4 - Próxima Faixa");
            System.out.println("5 - Faixa Anterior");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            comando = read.nextInt();

            switch (comando) {
                case 1:
                    cd.tocaCD();
                    break;
                case 2:
                    cd.interompeCD();
                    break;
                case 3:
                    cd.paraCD();
                    break;
                case 4:
                    cd.proximaFaixa();
                    break;
                case 5:
                    cd.faixaAnterior();
                    break;
                case 0:
                    System.out.println("Encerrando o CD Player.");
                    break;
                default:
                    System.out.println("Comando inválido.");
            }
            System.out.println(cd.toString());;
        } while (comando != 0);

        read.close();
    }
}
