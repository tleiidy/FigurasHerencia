/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry;

/**
 *
 * @author Leidy Torres
 */
public class Circulo extends Figuras {

    protected double radio;
    final double PI = 3.14159;


    /**
     * Constructor que inicializa las variables de la clase Puntos
     * @param punto1
     * @param punto2 
     */
    public Circulo(Ejes punto1, Ejes punto2) {
        super(punto1, punto2);
    }


    /**
     * Metodo que imprime los resultados del Circulo
     */
    public void resultadosCirculo(){
            System.out.println("Radio : "+radio());
            System.out.println("Perimetro : "+perimetro());
            System.out.println("Area : "+area());
    }

    /**
     * Metodo que retorna la longitud del punto AB
     * @return 
     */
    private double radio(){
        double auxiliarX=Math.pow((punto1.getX()-punto2.getX()), 2);
        double auxiliarY=Math.pow((punto1.getY()-punto2.getY()), 2);
        radio = Math.sqrt( auxiliarX + auxiliarY );
        return radio;
    }
 
    /**
     * Metodo que retorna el perimetro
     * @return 
     */
    private double perimetro(){
        double perimetro = 2* (PI * this.radio);
        return perimetro;
    }
    /**
     *  Metodo que retorna el area
     * @return 
     */
    private double area(){
        double area = PI * Math.pow(this.radio,2);
        return area;
    }   
}
