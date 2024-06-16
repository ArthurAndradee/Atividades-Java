public class Quadrado {
    private double ladoDoQuadrado;

    public double getLadoDoQuadrado() {
        return ladoDoQuadrado;
    }

    public void setLadoDoQuadrado(double ladoDoQuadrado) {
        this.ladoDoQuadrado = ladoDoQuadrado;
    }
    
    public double getAreaQuadrado() {
        return ladoDoQuadrado * ladoDoQuadrado;
    }

    public double getPerimetroQuadrado() {
        return 4 * ladoDoQuadrado;
    }

    public double getDiagonalQuadrado() {
        double valorRaizDeDoiz = 1.41421356237309504880168872420969807856967187537694807317667973; //Valor aproximado de √2
        return ladoDoQuadrado * valorRaizDeDoiz;
    }
}
