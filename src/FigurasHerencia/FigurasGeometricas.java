package FigurasHerencia;
import java.awt.Color;
import java.util.Random;
public abstract class FigurasGeometricas {
    private Integer x, y, X2, Y2, destX, destY, dx, dy;
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
      X2 = rj.nextInt(1000)-100;
      }
    return X2;
    }
    
    public Integer GetY2 () {
    int Y2 = 0;
    Random rj = new Random (); 
    for (int v = 0; v < 20; v++) {
      Y2 = rj.nextInt (300)-90;
      }
    return Y2;
    }
    
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    public Integer GetMovX () {
        Integer x;
        Random rx = new Random ();
        x =rx.nextInt(300)+100;
    return x;
    }
    
    public Integer GetMovY () {
        Integer y;
        Random ry = new Random ();
        y = ry.nextInt(300)+100;
    return y;
    }

public abstract void MoverLugar(Canvas c);

public void SetDestino (Integer destX, Integer destY){
     Random r = new Random();
        destX =r.nextInt((500)+100);
        destY =r.nextInt((500)+100);
        
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
  }

public void CalcularPosición () {
     if (destX!=getX()&&(destY!=getY())){
            setX(getX()+dx);
            setY(getY()+dy);
        }
    try {
        if (destX == getX() && destY == getY()) {
        setX (getX() + dx);
        setY (getY() + dy);        
        }
    }
    catch (ClassCastException e) {
     }
   }
}
    
        
        
    


    
    /**public void MovimientoVariado (Canvas z) {
       Integer posX, posY, posX2, posY2, posX3, posY3, movx, movy;
       Random dj = new Random ();
       movx = dj.nextInt(100);
       movy = dj.nextInt(300)+100;
       posX = GetX2 ();  posY = GetY2();
       posX2 = GetX2 (); posY2 = GetY2();
       posX3 = GetX2 (); posY3 = GetY2();
       z.setColorDeLapiz(getColor());
       z.rellenarRectangulo(posX, posY, 20, 30);
       z.rellenarTriangulo(posX2, posY2, 3, 5);
       z.rellenarCirculo(posX3, posY3, 30);
       
       for (int x = 0; x < 200; x++) {
           z.rellenarRectangulo(posX, posY, 60, 40);
           z.rellenarTriangulo(posX2, posY2, 20, 25);
           z.rellenarCirculo(posX3, posY3, 30);
           z.espera(10);
           z.borrarRectangulo(posX, posY, 60, 40);
           z.borrarTriangulo(posX2, posY2, 20, 25);
           z.borrarCirculo(posX3, posY3, 30);
           if ((movx > getX()) {
            posX++;
            posX2--;
            posX3++;
           }
           if ((movx < getX())){
            posX--;
            posX2++;
            posX3--;
           }
           if ((movy > getY())){
            posY--;
            posY2++;
            posY3++;
           }
           if (movy < getY()){
            posY++;
            posY2--;
            posY3--;
          
      }
    }
  } */



    