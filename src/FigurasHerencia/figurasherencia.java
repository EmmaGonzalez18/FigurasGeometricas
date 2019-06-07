package FigurasHerencia;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
public class figurasherencia {
    private Canvas miCanvas;
    public static void main(String[] args) {
        Triangulo t = new Triangulo (10.3, 14.5, Color.CYAN);
        Rectangulo r = new Rectangulo (12.3, 14.4, Color.GREEN, 550, 300, 12, 15);
        Circulo c = new Circulo (12.0, 15.3, Color.ORANGE);
        System.out.println ("Se ha formado un rectángulo de: "+r.getAncho()+"m de ancho, "+r.getLargo()+"m de largo. Formando un perimetro de: "+r.Perimetro()+"m, y una superficie de: "+r.Superficie()+"m.");
    r.setAncho (22.2);
    r.setLargo(12.0);
        System.out.println ("Con los valores asignados tenemos un rectángulo de: "+r.getAncho()+"m de ancho, "+r.getLargo()+"m de largo obteniendo un perimetro de: "+r.Perimetro()+"m y una superficie de: "+r.Superficie()+"m.");
        System.out.println ("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println ("Se ha formado un triángulo de: "+t.getBase()+"m de base, "+t.getAltura()+"m de altura.");
    t.setBase(12.12);
    t.setAltura(14.5);
        System.out.println ("Con los datos modificados queda un triángulo de: "+t.getBase()+"m de base y "+t.getAltura()+"m de altura.");
        System.out.println ("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println ("Se ha formado un circulo con un radio de: "+c.GetRadio()+"m y un diámetro de: "+c.Diámetro()+"m, dando una superficie de: "+c.Superficie()+"m y un perímetro de: "+c.Perímetro()+"m.");
    c.SetRadio(12.3);
    c.SetDiámetro(38);
        System.out.println ("Con los datos modificados queda un circulo con: "+c.GetRadio()+"m de radio, "+c.Diámetro()+"m de diámetro, dando una superficie de: "+c.Superficie()+"m y un perímetro de: "+c.Perímetro()+"m.");
        figurasherencia pantalla = new figurasherencia();
    //   pantalla.GraficarFiguras();
   //    pantalla.ColleccionFiguras();
  //     pantalla.Movimiento ();
         pantalla.MovimientoVariado ();
    }
 
    public void MovimientoVariado () {
        miCanvas = new Canvas ("Figuras con movimiento Variado", 1900, 1600);
        miCanvas.setVisible(true);
        ArrayList<FigurasGeometricas> lista = new ArrayList <> ();
        Rectangulo r = new Rectangulo(100., 50., Color.red, 300, 300, 20, 20);
        lista.add(r);
        Triangulo t = new Triangulo (40., 50., Color.CYAN, 100, 100, 20, 20);
        lista.add(t);
        Circulo c = new Circulo (20.0, 12.0, Color.BLUE);
        lista.add(c);
        r = new Rectangulo(150., 150., Color.yellow, 200, 200, 30, 30);
        lista.add(r);
        r = new Rectangulo(50., 75., Color.blue, 100, 100, 30, 30);
        lista.add(r);
        
        t = new Triangulo (40., 50., Color.LIGHT_GRAY, 100, 100, 20, 20);
        lista.add (t);
        t = new Triangulo (40., 50., Color.PINK, 20, 90, 100, 20);
        lista.add (t);
        
        c = new Circulo (10., 12., Color.GREEN);
        lista.add (c);
        c = new Circulo (50., 30., Color.WHITE);
        lista.add (c);
        for (FigurasGeometricas f : lista) {
            try {
                f.MovimientoVariado (miCanvas);
            }
            catch (ClassCastException e) {
            
            }
            
        }
    }
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  /** public void Movimiento () {   
   miCanvas = new Canvas ("Figuras Geometricas", 1900, 1900);
   miCanvas.setVisible(true);
        ArrayList<FigurasGeometricas> lista = new ArrayList <> ();
        Random valor = new Random();
        Rectangulo r = new Rectangulo(100., 50., Color.red, 300, 300, 20, 20);
        lista.add(r);
        
        Triangulo t = new Triangulo (40., 50., Color.CYAN, 100, 100, 20, 20);
        lista.add(t);
        
        Circulo c = new Circulo (20.0, 12.0, Color.BLUE);
        lista.add(c);
        r = new Rectangulo(150., 150., Color.yellow, 200, 200, 30, 30);
        lista.add(r);
        r = new Rectangulo(50., 75., Color.blue, 100, 100, 30, 30);
        lista.add(r);
        
        t = new Triangulo (40., 50., Color.LIGHT_GRAY, 100, 100, 20, 20);
        lista.add (t);
        t = new Triangulo (40., 50., Color.PINK, 20, 90, 100, 20);
        lista.add (t);
        
        c = new Circulo (10., 12., Color.GREEN);
        lista.add (c);
        c = new Circulo (50., 30., Color.WHITE);
        lista.add (c);
        for (FigurasGeometricas f : lista) {
          try {
            Rectangulo r2 = (Rectangulo) f;
            r2.mover(miCanvas, valor.nextInt(100)+10, valor.nextInt(100)+10);
        }
        catch (ClassCastException e) {
          
        } 
          try {
              Triangulo t2 = (Triangulo) f;
              t2.mover2(miCanvas, valor.nextInt(400)+10, valor.nextInt (400)+10);
          }
        catch (ClassCastException e) {
            
        }
          try {
              Circulo c2 = (Circulo) f;
              c2.mover3(miCanvas, valor.nextInt(800)+10, valor.nextInt(800)+10);
          }
          catch (ClassCastException e) {
              
          }
        }
     }*/
  }  
    /**  private void GraficarFiguras() {
      Triangulo t = new Triangulo (10.3, 14.5, 3., 3., 3., 3., Color.CYAN);
      Rectangulo r = new Rectangulo (12.3, 14.4, Color.GREEN, 550, 300, 12, 15);
      Circulo c = new Circulo (12.0, 15.3, Color.ORANGE);
      miCanvas = new Canvas("Figuras Geometricas", 900, 700);
      miCanvas.setVisible (true);
      //miCanvas.setColorDeLapiz(Color.green);
      //miCanvas.rellenarRectangulo(500, 300, 85, 40);
      //miCanvas.setColorDeLapiz(Color.blue);
      //miCanvas.rellenarCirculo (400, 300, 40);
      //miCanvas.setColorDeLapiz(Color.orange);
      //miCanvas.rellenarTriangulo(300, 300, 33, 90);   
      int PosX = 10;
      miCanvas.setColorDeLapiz(Color.orange);
      miCanvas.rellenarRectangulo(PosX, 150, 40, 30);
      for (int x = 0; x < 200; x++) {
          miCanvas.rellenarRectangulo(PosX, 150, 40, 30);
          miCanvas.espera(10);
          miCanvas.borrarRectangulo(PosX, 150, 40, 30);
          PosX++;
          r.getX();
          r.getY();
          r.getAncho();
          r.getLargo();
      }
      miCanvas.rellenarRectangulo(PosX, 150, 40, 30);
        miCanvas.setColorDeLapiz(Color.green);
        int PosY = 900;
        miCanvas.rellenarTriangulo (300, PosY, 33, 90);
        for (int tt = 0; tt < 800; tt++) {
            miCanvas.rellenarTriangulo(300, PosY, 33, 90);
            miCanvas.espera(10);
            miCanvas.borrarTriangulo(300, PosY, 33, 90);
            PosY--;
            t.getX();
            t.getY();
            t.getBase();
            t.getAltura();
        }
        miCanvas.rellenarTriangulo(300, PosY, 33, 90); 
       int PosX2 = 20, PosY2 = 100;
        miCanvas.setColorDeLapiz(Color.blue);
        miCanvas.rellenarCirculo(PosX2, PosY2, 40);
        for (int g = 0; g < 200; g++) {
            miCanvas.rellenarCirculo(PosX2, PosY2, 40);
            miCanvas.espera(10);
            miCanvas.borrarCirculo(PosX2, PosY2, 40);
            PosX2++;
            PosY2++;
            c.Superficie();
            c.GetDiámetro();
            c.GetRadio();
            
        }
        miCanvas.rellenarCirculo(PosX2, PosY2, 40); */

/** private void ColleccionFiguras () {
miCanvas = new Canvas("Figuras Geometricas", 1900, 1600);
miCanvas.setVisible(true);
ArrayList<FigurasGeometricas> lista = new ArrayList <> ();
        Rectangulo r = new Rectangulo(100., 50., Color.red, 300, 300, 20, 20);
        lista.add(r);
        
        Triangulo t = new Triangulo (40., 50., Color.CYAN, 100, 100, 20, 20, 3., 3., 3., 3.);
        lista.add(t);
        
        Circulo c = new Circulo (20.0, 12.0, Color.BLUE);
        lista.add(c);
        r = new Rectangulo(150., 150., Color.yellow, 200, 200, 30, 30);
        lista.add(r);
        r = new Rectangulo(50., 75., Color.blue, 100, 100, 30, 30);
        lista.add(r);
        
        t = new Triangulo (40., 50., Color.LIGHT_GRAY, 100, 100, 20, 20, 3., 3., 3., 3.);
        lista.add (t);
        t = new Triangulo (40., 50., Color.PINK, 20, 90, 100, 20, 3., 3., 3., 3.);
        lista.add (t);
        
        c = new Circulo (10., 12., Color.GREEN);
        lista.add (c);
        c = new Circulo (50., 30., Color.WHITE);
        lista.add (c);
        for (FigurasGeometricas f : lista) {
              try {
                Rectangulo r2 = (Rectangulo) f;
                r2.MoverRectangulo(miCanvas);
              
              
              }
              
            catch (ClassCastException e) {
            }
              try {
              Triangulo t2 = (Triangulo) f;
              miCanvas.setColorDeLapiz(t2.getColor());
              System.out.println("Base = " + t2.getBase() + " altura = " + t2.getAltura());
              int PosX2 = t2.GetX2(), PosY2 = t2.GetY2();
              for (int j = 0; j < 200; j++) {
                  miCanvas.rellenarTriangulo(PosX2, PosY2, t2.getBase().intValue(), t2.getAltura().intValue());
                  miCanvas.espera(10);
                  miCanvas.borrarTriangulo (PosX2, PosY2, t2.getBase().intValue(), t2.getAltura().intValue());
                  PosX2 = t2.Mover(PosX2);
                  PosY2 = t2.Mover2(PosY2);
              }   
              
            miCanvas.setColorDeLapiz(t2.getColor());
            miCanvas.rellenarTriangulo(t2.GetX2(), t2.GetY2(), t2.getBase().intValue(), t2.getAltura().intValue());
            }
        
              catch (ClassCastException e) {
              }
           
              try {
                  Circulo c2 = (Circulo) f;              
                  c2.SetDiámetro(32.0);
                  miCanvas.setColorDeLapiz(c2.getColor());
                  System.out.println ("Tiene un diámetro de: "+c2.GetDiámetro()+"m y un radio de: "+c2.GetRadio()+".");
                  int PosX3 = c2.GetX2(), PosY3 = c2.GetY2();
                  for (int u = 0; u < 200; u++) {
                      miCanvas.rellenarCirculo(PosX3, PosY3, c2.GetDiámetro().intValue());
                      miCanvas.espera(10);
                      miCanvas.borrarCirculo(PosX3, PosY3, c2.GetDiámetro().intValue());
          
        }
            miCanvas.setColorDeLapiz(c2.getColor());
            miCanvas.rellenarCirculo(c2.GetX2(), c2.GetY2(), c2.GetDiámetro().intValue());
              }
              catch (ClassCastException e) {
                } 
            } 
        } */

//miCanvas.setColorDeLapiz(r2.getColor());
               /** System.out.println("Lado1 = " + r2.getAncho() + " lado2 = " + r2.getLargo());
                int PosX = r2.GetX2(), PosY = r2.GetY2();
                for (int m = 0; m < 200; m++) {
                    miCanvas.rellenarRectangulo(PosX, PosY, r2.getAncho().intValue(), r2.getLargo().intValue());
                    miCanvas.espera(10);
                    miCanvas.borrarRectangulo(PosX, PosY, r2.getAncho().intValue(), r2.getLargo().intValue());
                    r2.getAncho();
                    r2.getLargo();
                    PosY = r2.Mover(PosY);
                    PosX = r2.Mover2(PosX);
                }
            miCanvas.setColorDeLapiz(r2.getColor());
            miCanvas.rellenarRectangulo(r2.GetX2(), r2.GetY2(), r2.getAncho().intValue(), r2.getLargo().intValue());
             } */
