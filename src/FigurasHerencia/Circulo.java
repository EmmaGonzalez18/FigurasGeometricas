package FigurasHerencia;
import java.awt.Color;
public class Circulo extends FigurasGeometricas {
    private Double Radio, Diámetro;
   // private Color Color;
public Circulo (Double r, Double d, Color c, Integer x, Integer y) {
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

public void MoverLugar (Canvas z) {
    z.setColorDeLapiz(getColor ());
    z.borrarCirculo(getX (), getY (), Diámetro.intValue());
    CalcularPosición ();
    z.rellenarCirculo(getX (), getY (), Diámetro.intValue());
  }
}