/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.pkg78;

import java.util.Scanner;

/**
 *
 * @author adrian
 */
public class Práctica78 {

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
         * Declarar base
         */
        System.out.println("Dame la base");
        p1.setbase(teclado.nextInt());
        
        /**
         * Declarar altura
         */
        System.out.println("Dame la altura");
        p1.setaltura(teclado.nextInt());
        
        /**
         * Operación area
         */
        p1.area(p1.getbase(), p1.getaltura());
        
        /**
         * Mostrar resultado area
         */
        System.out.println("El area es "+p1.getresult());
        
    }
    
}
