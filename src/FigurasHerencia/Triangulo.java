package FigurasHerencia;
import java.awt.Color;
    public class Triangulo extends FigurasGeometricas {
    private Double base, altura;

    public Triangulo (Double b, Double a, Color c) {
        super(c);
        base = b;
        altura = a;
    }

//public Rectangulo (Double l, Double a, String c, Integer x, Integer y) {
    public Triangulo (Double b, Double a, Color c, Integer x, Integer y, Integer X2, Integer Y2) {
        super(x, y, X2, Y2, c);
        base = b;
        altura = a;
    }
    
    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}    
    
    

