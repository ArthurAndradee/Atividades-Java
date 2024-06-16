public class Teste {
    public static void main(String[] args) throws Exception {
        ContaCorrente contaCorrente = new ContaCorrente("111", "Alberto", 1000);

        contaCorrente.depositarDinheiro(100);
        System.out.println(contaCorrente.toString());
        
        contaCorrente.sacarDinheiro(1000);
        System.out.println(contaCorrente.toString());

        contaCorrente.sacarDinheiro(112);
        System.out.println(contaCorrente.toString());
    }
}
