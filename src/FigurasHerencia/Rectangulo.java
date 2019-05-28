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

   public void mover (Canvas c, Integer destX, Integer destY) {
        Integer dx = 0, dy = 0;
        if (destX > getX()) {
            dx = 1;
        }
        if (destX < getX()) {
            dx = -1;
        }
        if (destY > getY()) {
            dy = 1;
        }
        if (destY < getY()) {
            dy = -1;
        }
        
        c.setColorDeLapiz(Color.GREEN);
        for (Integer i = 0; i < 200; i = i+1) {
            c.rellenarRectangulo(getX(), getY(), largo.intValue(), ancho.intValue());
            c.espera(10);
            c.borrarRectangulo(getX(), getY(), largo.intValue(), ancho.intValue());            
            setX(getX()+dx);
            setY(getY()+dy);
        }
        c.rellenarRectangulo(getX(), getY(), largo.intValue(), ancho.intValue());
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   /** public void MoverRectangulo (Canvas miCanvas) {
       miCanvas.setColorDeLapiz(getColor ());
       int PosX = GetX2(), PosY = GetY2();
                for (int m = 0; m < 800; m++) {
                    miCanvas.rellenarRectangulo(PosX, PosY, getAncho().intValue(), getLargo().intValue());
                    miCanvas.espera(10);
                    miCanvas.borrarRectangulo(PosX, PosY, getAncho().intValue(), getLargo().intValue());
                    getAncho();
                    getLargo();
                    PosX++;
                    PosY--;
   }
 } */
}
