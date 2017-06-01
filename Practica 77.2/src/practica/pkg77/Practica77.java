/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg77;

import java.util.Scanner;

/**
 *
 * @author adrian
 */
public class Practica77 {

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
         * Declarar radio
         */
        System.out.println("Dame el radio");
        p1.setradio(teclado.nextInt());
        
        /**
         * Operación longitud
         */
        p1.longitud(p1.getradio());
        
        /**
         * Mostrar resultado longitud
         */
        System.out.println("La longitud es "+p1.getresult());
        
        /**
         * Operacion area
         */
        p1.area(p1.getradio());
        
        /**
         * Mostrar resultado longitud
         */
        System.out.println("El area es "+p1.getresult());
    
}
}
