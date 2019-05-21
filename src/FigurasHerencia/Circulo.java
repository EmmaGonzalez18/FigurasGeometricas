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

public Double GetDiámetro () {
    return Diámetro;
}

public void SetDiámetro (Double D) {
    Diámetro = D;
}

public Double Superficie () {
    return (3.14 * Radio * Radio);
}

public Double Perímetro () {
    return (3.14 * Diámetro);
   }
}