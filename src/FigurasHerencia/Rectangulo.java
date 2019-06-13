package FigurasHerencia;
import java.awt.Color;
public class Rectangulo extends FigurasGeometricas {
    private Double largo;
    private Double ancho; 
    private Canvas miCanvas;
public Rectangulo (Double l, Double a, Color c) {
        super(c);
        largo = l;
        ancho = a;
}
//public Rectangulo (Double l, Double a, String c, Integer x, Integer y) {
    public Rectangulo (Double l, Double a, Color c, Integer x, Integer y, Integer X2, Integer Y2) {
        super(x, y, X2, Y2, c);
        largo = l;
        ancho = a;
    }
    
    public Double Perimetro () {
        return 2 * getLargo() + 2 * getAncho();
    }

    public Double Superficie () {
        return getLargo() * getAncho();
    }

    /**
     * @return the largo
     */
    public Double getLargo() {
        return largo;
    }

    /**
     * @param largo the largo to set
     */
    public void setLargo(Double largo) {
        this.largo = largo;
    }

    /**
     * @return the ancho
     */
    public Double getAncho() {
        return ancho;
    }

    /**
     * @param ancho the ancho to set
     */
    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }
    
    public void MoverLugar (Canvas z) {
    z.setColorDeLapiz(getColor ());
    z.borrarRectangulo (getX (), getY (), ancho.intValue(), largo.intValue());;
    CalcularPosición ();
    z.rellenarRectangulo(getX (), getY (), ancho.intValue(), largo.intValue());
       }
    
    }


    
    
    
    
    /**public void mover (Canvas c, Integer destX, Integer destY) {
        Integer dx = 0, dy = 0;
        if (destX > getX()) {
            dx = 1;
        }
        if (destX < getX()) {
            dx = -1 ;
        }
        if (destY > getY()) {
            dy = 1;
        }
        if (destY < getY()) {
            dy = -1;
        } */


