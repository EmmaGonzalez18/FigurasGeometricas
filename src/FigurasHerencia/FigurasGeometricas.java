package FigurasHerencia;
import java.awt.Color;
import java.util.Random;
public class FigurasGeometricas {
    private Integer x, y, X2, Y2;
    private Color color;
public FigurasGeometricas (Color color) {
        this.x = 0;
        this.y = 0;
        this.X2 = 0;
        this.Y2 = 0;
        this.color = color;
    }

public FigurasGeometricas (Integer x, Integer y, Integer X2, Integer Y2, Color color) {
        this.x = x;
        this.y = y;
        this.X2 = X2;
        this.Y2 = Y2;
        this.color = color;
    }

   public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

   public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer GetX2 () {
    int X2 = 0;
    Random rj = new Random (); 
    for (int v = 0; v < 20; v++) {
      X2 = rj.nextInt(400)-30;
      }
    return X2;
    }
    
    public Integer GetY2 () {
    int Y2 = 0;
    Random rj = new Random (); 
    for (int v = 0; v < 20; v++) {
      Y2 = rj.nextInt(400)-100;
      }
    return Y2;
    }
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}

    