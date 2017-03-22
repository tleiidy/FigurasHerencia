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
public class Ejes {
    /**
     * Atributo que aloja la cordenada en el eje x
     */
    private double x;

    /**
     * Atributo que aloja la cordenada en el eje y
     */    
    private double y;

    /**
     * Constructor de la clase que inicializa las variables
     * @param x
     * @param y 
     */
    public Ejes(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Retorna el valor de la cordenada en el eje x 
     * @return x
     */
    public double getX() {
        return x;
    }

    /**
     * Modifica cordenada en el eje x
     * @param x 
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Retorna el valor de la cordenada en el eje y 
     * @return y
     */    
    public double getY() {
        return y;
    }

    /**
     * Modifica cordenada en el eje y
     * @param y
     */    
    public void setY(double y) {
        this.y = y;
    }

    
}
