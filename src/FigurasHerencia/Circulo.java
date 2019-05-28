package FigurasHerencia;
import java.awt.Color;
public class Circulo extends FigurasGeometricas {
    private Double Radio, Diámetro;
   // private Color Color;
public Circulo (Double r, Double d, Color c) {
    super (c);
    Radio = r;
    Diámetro = d;
}    

public Double GetRadio () {
    return Radio;
}

public void SetRadio (Double r) {
    Radio = r;
}

public Double Diámetro () {
    return Radio*2;
}

public void SetDiámetro (Integer diámetro) {
    this.Diámetro = Diámetro;
}

public Double Superficie () {
    return (3.14 * Radio * Radio);
}

public Double Perímetro () {
    return (3.14 * Diámetro);
   }

public void mover3 (Canvas c3, Integer despX, Integer despY) {
    Integer dx = 0, dy = 0;
        if (despX > getX()) {
            dx = 1;
        }
        if (despX < getX()) {
            dx = -1;
        }
        if (despY > getY()) {
            dy = 1;
        }
        if (despY < getY()) {
            dy = -1;
        }
        c3.setColorDeLapiz(Color.CYAN);
        for (Integer u = 0; u < 200; u++) {
            c3.rellenarCirculo(getX(), getY(), Diámetro().intValue());
            c3.espera(10);
            c3.borrarCirculo(getX(), getY(), Diámetro().intValue());            
            setX(getX()+dx);
            setY(getY()+dy);
        }
        c3.rellenarCirculo(getX(), getY(), Diámetro().intValue());
    }
}