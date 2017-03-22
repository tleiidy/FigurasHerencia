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
public class Cuadrado extends Figuras {
    
    final String CUADRADO = "Es un Cuadrado";
    final String RECTANGULO = "Es un Rectangulo";
    Ejes punto3;
    Ejes punto4;

    /**
     * Contructor que inicializa las variables
     * @param punto3
     * @param punto4
     * @param punto1
     * @param punto2 
     */
    public Cuadrado(Ejes punto3, Ejes punto4, Ejes punto1, Ejes punto2) {
        super(punto1, punto2);
        this.punto3 = punto3;
        this.punto4 = punto4;
    }

     /**
     * Metodo que imprime los resultados del Cuadrado o Rectangulo
     */
    public void resultados(){

            System.out.println("Lado1: " + lado1());
            System.out.println("Lado2: " + lado2());
            System.out.println("Lado3: " + lado3());
            System.out.println("Lado4: " + lado4());
            System.out.println("Perimetro : "+perimetro());
            System.out.println("Area : "+area());

    }

    /**
     * Metodo que retorna la longitud del lado  AB
     * @return 
     */
    private double lado1(){
        double auxiliarX = Math.pow(punto2.getX() - punto1.getX(), 2);
        double auxiliarY = Math.pow(punto2.getY() - punto1.getY(), 2);
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
     /**
     * Metodo que retorna la longitud del lado BC
     * @return 
     */
    private double lado2(){
        double auxiliarX = Math.pow(punto3.getX() - punto2.getX(), 2);
        double auxiliarY = Math.pow(punto3.getY() - punto2.getY(), 2);
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
     /**
     * Metodo que retorna la longitud del lado CD
     * @return 
     */
    private double lado3(){
        double auxiliarX = Math.pow(punto3.getX() - punto2.getX(), 2);
        double auxiliarY = Math.pow(punto3.getY() - punto2.getY(), 2);
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
   /**
    * Metodo que retorna la longitud del lado DA
    * @return 
    */
    private double lado4(){
        double auxiliarX = Math.pow(punto3.getX() - punto4.getX(), 2);
        double auxiliarY = Math.pow(punto3.getY() - punto4.getY(), 2);
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    /**
     * Metodo que imprime si los puntos forman un cuadrado o un rectangulo
     * @param tipo 
     */
    public void imprimirTipo(int tipo) {
        switch (tipo) {
            case 1:
                System.out.println(CUADRADO);
                break;
            case 2:
                System.out.println(RECTANGULO);
                break;
        }
    }
    
     /**
     *Determina si es o no un cuadrado
     *
     */
    protected void identificarCuadrado() {
        if ((((lado1() == lado2()) && (lado2() == lado3()) && 
                (lado3() == lado4())))){
            imprimirTipo(1);
        }else{
            imprimirTipo(2);
        }
    }
    
    
    /**
     * Metodo que retorna perimetro
     * @return 
     */
    private double perimetro(){
        this.perimetro= lado1() + lado2() + lado3() + lado4();
        return this.perimetro;
    }
    /**
     * Metodo que retorna el area
     * @return 
     */
    private double area(){
        double area = lado1() * lado2();
        return area;
    }
    /**
     * Retorna el valor del punto 3 en los ejes X & Y
     * @return 
     */
    public Ejes getPunto3() {
        return punto3;
    }
    /**
     * Modifica el valor del punto 3 en los ejes X & Y
     * @param punto3 
     */
    public void setPunto3(Ejes punto3) {
        this.punto3 = punto3;
    }

    /**
     * Retorna el valor del punto 4 en los ejes X & Y
     * @return 
     */
    public Ejes getPunto4() {
        return punto4;
    }
    /**
     * Modifica el valor del punto 4 en los ejes X & Y
     * @param punto4 
     */
    public void setPunto4(Ejes punto4) {
        this.punto4 = punto4;
    }
     
}
