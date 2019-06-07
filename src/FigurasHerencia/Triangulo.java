package FigurasHerencia;
import java.awt.Color;
import java.util.Random;
    public class Triangulo extends FigurasGeometricas {
    private Double base, altura;
    public Triangulo (Double b, Double a, Color c) {
        super(c);
        base = b;
        altura = a;
    }

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
    
   /**  public void mover2 (Canvas c2, Integer despX, Integer despY) {
        Random uio2 = new Random ();
        Integer dx = 0, dy = 0;
        if (despX > getX()) {
            dx = uio2.nextInt(19)-9;
        }
        if (despX < getX()) {
            dx = uio2.nextInt(19)-9;
        }
        if (despY > getY()) {
            dy = uio2.nextInt(19)-9;
        }
        if (despY < getY()) {
            dy = uio2.nextInt(19)-9;
        }
        c2.setColorDeLapiz(getColor ());
        for (Integer y = 0; y < 100; y++) {
            c2.rellenarTriangulo(getX(), getY(), base.intValue(), altura.intValue());
            c2.espera(10);
            c2.borrarTriangulo(getX(), getY(), base.intValue(), altura.intValue());
            setX (getX ()+dx);
            setY (getY ()+dy);
        }
        c2.rellenarTriangulo(getX(), getY(), base.intValue(), altura.intValue());
    }   */
 }  

