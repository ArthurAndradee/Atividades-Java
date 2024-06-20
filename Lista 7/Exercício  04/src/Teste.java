public class Teste {
    public static void main(String[] args) throws Exception {
        Proprietario primeiroProprietario = new Proprietario("Arthur", "Rua ABC", 'm', "048", "662");
        
        Veiculo veiculo1 = new Veiculo("111", "preto", "corsa", primeiroProprietario);
        Veiculo veiculo2 = new Veiculo("222", "preto", "monza", primeiroProprietario);
        Veiculo veiculo3 = new Veiculo("333", "preto", "strada", primeiroProprietario);
        
        Proprietario segundoProprietario = new Proprietario("Amanda", "Rua DEF", 'f', "662", "048");
        
        Veiculo veiculo4 = new Veiculo("444", "preto", "kwid", segundoProprietario);
        Veiculo veiculo5 = new Veiculo("555", "preto", "onix", segundoProprietario);

        System.out.println(veiculo1 + "\n" + veiculo2 + "\n" + veiculo3 + "\n" + veiculo4 + "\n" + veiculo5);
    }
}
