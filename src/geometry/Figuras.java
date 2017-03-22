/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry;

import java.util.Scanner;

/**
 *
 * @author Leidy Torres
 */
public class Figuras {
    
        double x, y;
        public double perimetro;
        public double area;
        private Scanner teclado;
        Ejes punto1;
        Ejes punto2;

    public Figuras(Ejes punto1, Ejes punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    
    public Ejes getPunto1() {
        return punto1;
    }

    public void setPunto1(Ejes punto1) {
        this.punto1 = punto1;
    }

    public Ejes getPunto2() {
        return punto2;
    }

    public void setPunto2(Ejes punto2) {
        this.punto2 = punto2;
    }
        
    
    
}
