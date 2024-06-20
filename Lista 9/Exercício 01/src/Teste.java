public class Teste {
    public static void main(String[] args) throws Exception {
        Modelo1 tvModelo1 = new Modelo1(true, 110, 40);
        Modelo2 tvModelo2 = new Modelo2(false, 220, 66);
        Radio radio = new Radio(110, "Foo Fighers", 2, 99, true);

        radio.aumentarVolume(5);
        tvModelo1.desligar();
        tvModelo2.ligar();
        tvModelo2.mudarCanal(5);
    };
}
