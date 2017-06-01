/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.pkg83;

import java.util.Scanner;

/**
 *
 * @author adrian
 */
public class Práctica83 {

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
         * Declarar variables
         */
        System.out.println("Dame el x ");
        p1.setx(teclado.nextDouble());
        
        System.out.println("Dame el x2 ");
        p1.setx2(teclado.nextDouble());
        
        System.out.println("Dame el x3 ");
        p1.setx3(teclado.nextDouble());
        
        /**
         * Llamo a la operacion
         */
        p1.operacion(p1.getx(), p1.getx2(), p1.getx3());
        
        /**
         * Mostrar resultado
         */
        System.out.println("El primer resultado obtenido es "+p1.getresult1());
        System.out.println("El segundo resultado obtenido es "+p1.getresult2());

        
    }
    
}
