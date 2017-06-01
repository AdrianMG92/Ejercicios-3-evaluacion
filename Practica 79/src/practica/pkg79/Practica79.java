/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg79;

import java.util.Scanner;

/**
 *
 * @author adrian
 */
public class Practica79 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Declarar objetos
         */
        Operaciones p1 = new Operaciones();
        
        /**
         * Entrada por teclado
         */
        Scanner teclado= new Scanner (System.in);
        
        /**
         * Declarar lado
         */
        System.out.println("Dame el lado");
        p1.setlado(teclado.nextInt());
        
        /**
         * Declarar apotema
         */
        System.out.println("Dame la apotema");
        p1.setapotema(teclado.nextInt());
        
        /**
         * Operación area
         */
        p1.area(p1.getlado(), p1.getapotema());
        
        /**
         * Mostrar resultado area
         */
        System.out.println("El area es "+p1.getresult());
    }
    
}
