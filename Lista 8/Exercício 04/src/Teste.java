public class Teste {
    public static void main(String[] args) throws Exception {
        Moeda cincoCentavos = new Moeda(0.05, "cincoCentavos");
        Moeda dezCentavos = new Moeda(0.10, "dezCentavos");
        Moeda vinteECincoCentavos = new Moeda(0.25, "vinteCincoCentavos");
        Moeda cinquentaCentavos = new Moeda(0.50, "cinquentaCentavos");
        Moeda umReal = new Moeda(1.00, "umReal");

        Cofrinho cofrinho = new Cofrinho();

        cofrinho.adicionarMoeda(cincoCentavos);
        cofrinho.adicionarMoeda(dezCentavos);
        cofrinho.adicionarMoeda(vinteECincoCentavos);
        cofrinho.adicionarMoeda(cinquentaCentavos);
        cofrinho.adicionarMoeda(umReal);

        System.out.println(cofrinho.toString());
    }
}
