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
public class Triangulo extends Figuras  {

    final String EQUILATERO = "Equilatero";
    final String ISOSCELES = "Isosceles";
    final String ESCALENO = "Escaleno";
    
    Ejes punto3;

    /**
     * Constructor que inicializa las variables
     * @param punto3
     * @param punto1
     * @param punto2 
     */
    public Triangulo(Ejes punto3, Ejes punto1, Ejes punto2) {
        super(punto1, punto2);
        this.punto3 = punto3;
        
    }

    /**
     * Metodo que da los resultados del triangulo
     */
    public void resultadosTriangulo() {
        if(isTriangulo()) {
            System.out.println("Lado1: " + lado1());
            System.out.println("Lado2: " + lado2());
            System.out.println("Lado3: " + lado3());
            System.out.println("Perimetro: " + perimetro());
            System.out.println("Area: " + area());
        } else {
            System.out.println("No es un triangulo");
        }    
    }
    
    /**
     * Retorna verdadero si es un triangulo 
     * @return 
     */
    private boolean isTriangulo() {
        if(punto1.getX() == punto2.getX() && punto2.getX() == punto3.getX()){
            return false;
        }else if(punto1.getY() == punto2.getY() && punto2.getY() == punto3.getY()){
            return false;
        } else{
            return true;
        }
    }
    
    /**
     * Retorma longitud de lado AB
     * @return 
     */
    private double lado1(){
        double auxiliarX = Math.pow(punto2.getX() - punto1.getX(), 2);
        double auxiliarY = Math.pow(punto2.getY() - punto1.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    
    /**
     * Retorma longitud de lado BC
     * @return 
     */
    private double lado2(){
        double auxiliarX = Math.pow(punto3.getX() - punto2.getX(), 2);
        double auxiliarY = Math.pow(punto3.getY() - punto2.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    
    /**
     * Retorma longitud de lado CA
     * @return 
     */
    private double lado3(){
        double auxiliarX = Math.pow(punto1.getX() - punto3.getX(), 2);
        double auxiliarY = Math.pow(punto1.getY() - punto3.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    
    /**
     * 
     * Metodo que retorna el perimetro del triangulo
     * @return Perimetro
     */
    private double perimetro() {        
        this.perimetro =  lado1() + lado2() + lado3();
        return this.perimetro;
    }
    
    /**
     * Metodo que retorna el area de un trianguo
     * @return  Area
     */
    private double area() {
        double semiperimetro = this.perimetro / 2;
        double lado1 = semiperimetro - lado1();
        double lado2 = semiperimetro - lado2();
        double lado3 = semiperimetro - lado3();
        
        double area =  Math.sqrt((semiperimetro * lado1 * lado2 * lado3));
        return area;
    }
    



  
    public void ImprimirTipo(int tipo) {
        switch (tipo) {
            case 1:
                System.out.println("Triangulo: "+ EQUILATERO);
                break;
            case 2:
                System.out.println(ISOSCELES);
                break;
            case 3:
                System.out.println(ESCALENO);
                break;
        }
    }

    /**
     *Determina el tipo de Triangulo
     *
     */
    protected void IdentificarTriangulo() {
        if ((lado1() == lado2()) && lado2() == lado3()) {
            ImprimirTipo(1);
        } else {
            if (lado1() == lado2()
                    || lado1() == lado3()
                    || lado2() == lado3()) {
                ImprimirTipo(2);
            }else{
                if (lado1() != lado2() ||
                        lado1() != lado3() ||
                        lado3() != lado2()){
                    ImprimirTipo(3);
                }
            }
        }
    }

    public Ejes getPunto3() {
        return punto3;
    }

    public void setPunto3(Ejes punto3) {
        this.punto3 = punto3;
    }

}
