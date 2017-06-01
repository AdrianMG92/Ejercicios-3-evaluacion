/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra3;

import java.util.Scanner;

/**
 *
 * @author adrian
 */
public class Extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Declarar objetos
         */
        Menú p1 = new Menú();
        Operaciones p2 = new Operaciones();
        
        /**
         * Entrada por teclado
         */
        Scanner teclado= new Scanner (System.in);
        
        /**
         * Hacer que te pida los pies
         */
        System.out.println("¿Cuantos pies tienes? ");
        p2.setpies(teclado.nextDouble());
        
        /**
         * LLamar al menu
         */
        p1.setmostrar();
        p1.setopcion();
        
       /**
        * Hacer el switch llamando a cada operación y mostrando resultados
        */
       switch(p1.getopcion()){
           case 'y':
                p2.opeyardas(p2.getpies());
                
                System.out.println("La cantidad de yardas es "+p2.getyardas());
                break;
            
           case 'p':
                p2.opepulgadas(p2.getpies());

                System.out.println("La cantidad de pulgadas es "+p2.getpulgadas());
                break;
            
           case 'c':
                p2.opecentimetros(p2.getpies());
                
                System.out.println("La cantidad de centimetros es "+p2.getcentimetros());
                break;
               
               
       }
    }
    
}
