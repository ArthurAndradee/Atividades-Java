public class Teste {
    public static void main(String[] args) throws Exception {
        Funcionario funcionario1 = new Funcionario("Arthur", "111");
        Funcionario funcionario2 = new Funcionario("Bruna", "222");

        Gerente gerente1 = new Gerente("Charlie", "333", "Suporte");

        System.out.println("Dados dos funcionários da empresa: \n Funcionarios: \n");
        System.out.println(funcionario1 + "\n" + funcionario2);

        System.out.println("\n Gerente: \n" + gerente1);
    }
}
