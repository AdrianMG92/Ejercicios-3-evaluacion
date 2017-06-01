/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg90;

import java.util.Scanner;

/**
 *
 * @author adrian
 */
public class Practica90 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Declaro el objeto
         */
        nif c1 = new nif();
        
        /**
         * Entrada por teclado
         */
        Scanner teclado= new Scanner (System.in);
        
        /**
         * pido el dni y muesto el resultado
         */
        System.out.println("Dime tu numero del dni");
        c1.setdni(teclado.nextInt());
        c1.calculo(c1.getdni());
    }
    
}
