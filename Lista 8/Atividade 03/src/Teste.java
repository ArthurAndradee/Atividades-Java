public class Teste {
    public static void main(String[] args) throws Exception {
        FuncionarioCLT funcionarioCLT = new FuncionarioCLT("Arthur", "111", 3500);
        FuncionarioHorista funcionarioHorista = new FuncionarioHorista("Bruna", "222", 75, 40);
        
        System.out.println(funcionarioCLT);
        System.out.println(funcionarioHorista);
    }
}
