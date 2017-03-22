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
public class Geometry {

    double x, y;
    private Scanner teclado;
    Figuras figuras;

    public Geometry() {
        teclado = new Scanner(System.in);        
        menu();
    }

    private void menu() {        
        while(true){
            System.out.println("---BIENVENIDO---");
            System.out.println("ESCOJA UNA OPCION");
            System.out.println("1.Triangulo");
            System.out.println("2.Cuadrado/Rectangulo");
            System.out.println("3.Circulo ");
            System.out.println("4.Salir");
            int opcion =  teclado.nextInt();
            switch (opcion){
                case 1: 
                    System.out.println("-Triangulo-");
                    iniciaTriangulo();
                break;
                case 2:
                    System.out.println("-Cuadrado/Rectangulo-");
                    iniciaCuadrado();
                break;
                case 3: 
                    System.out.println("-Circulo-");
                    iniciaCirculo();
                break;
            }
        }
    }
    
    
    private void iniciaTriangulo(){
        System.out.print("Digite lado x1 : ");
        x = teclado.nextDouble();
        System.out.print("Digite lado y1 : ");
        y = teclado.nextDouble();
        Ejes punto1 = new Ejes(x, y);
        System.out.print("Digite lado x2 : ");
        x = teclado.nextDouble();
        System.out.print("Digite lado y2 : ");
        y = teclado.nextDouble();
        Ejes punto2 = new Ejes(x, y);
        System.out.print("Digite lado x3 : ");
        x = teclado.nextDouble();
        System.out.print("Digite lado y3 : ");
        y = teclado.nextDouble();
        Ejes punto3 = new Ejes(x, y);
        
        Triangulo triangulo = new Triangulo(punto1, punto2, punto3);
        triangulo.resultadosTriangulo();
    }

     private void iniciaCuadrado(){
        System.out.print("Digite lado x1 : ");
        x = teclado.nextDouble();
        System.out.print("Digite lado y1 : ");
        y = teclado.nextDouble();
        Ejes punto1 = new Ejes(x, y);
        System.out.print("Digite lado x2 : ");
        x = teclado.nextDouble();
        System.out.print("Digite lado y2 : ");
        y = teclado.nextDouble();
        Ejes punto2 = new Ejes(x, y);
        System.out.print("Digite lado x3 : ");
        x = teclado.nextDouble();
        System.out.print("Digite lado y3 : ");
        y = teclado.nextDouble();
        Ejes punto3 = new Ejes(x, y);
        System.out.print("Digite lado x4 : ");
        x = teclado.nextDouble();
        System.out.print("Digite lado y4 : ");
        y = teclado.nextDouble();
        Ejes punto4 = new Ejes(x, y);
        Cuadrado cuadrado = new Cuadrado(punto1, punto2, punto3,punto4);
        cuadrado.identificarCuadrado();
        cuadrado.resultados();
    }
     
        private void iniciaCirculo(){
        System.out.print("Digite lado x1 : ");
        x = teclado.nextDouble();
        System.out.print("Digite lado y1 : ");
        y = teclado.nextDouble();
        Ejes punto1 = new Ejes (x,y);
        System.out.print("Digite lado x2 : ");
        x = teclado.nextDouble();
        System.out.print("Digite lado y2 : ");
        y = teclado.nextDouble();
        Ejes punto2 = new Ejes(x,y);
       Circulo circulo = new Circulo(punto1, punto2);
       circulo.resultadosCirculo();
    }
}
