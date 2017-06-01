/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg81;

import java.util.Scanner;

/**
 *
 * @author adrian
 */
public class Practica81 {

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
         * Operación area
         */
        p1.volumen(p1.getradio());
        
        /**
         * Mostrar resultado area
         */
        System.out.println("El volumen es "+p1.getresult());
    }
    
}
