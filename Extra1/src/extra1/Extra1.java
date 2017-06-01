/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra1;

import java.util.Scanner;

/**
 *
 * @author adrian
 */
public class Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Declaro los objetos
         */
        Menu p1 = new Menu();
        Operaciones p2 = new Operaciones();
        
        /**
         * Hago la entrada de teclado
         */
        Scanner teclado= new Scanner (System.in);
        
        /**
         * Llamar al menu
         */
        p1.setmostrar();
        p1.setopcion();
        
       /**
        * Hago el switch para caso
        */
        
       switch(p1.getopcion()){
           case 'a':
                /**
                 * Declarar variables
                 */
                System.out.println("Dame el primer cateto");
                p2.setcateto1(teclado.nextDouble());
        
                System.out.println("Dame el segundo cateto");
                p2.setcateto2(teclado.nextDouble());
        
                /**
                 * Operación
                 */
                p2.operacion1(p2.getcateto1(), p2.getcateto2());
                
                /**
                 * Mostrar resultado
                 */
                System.out.println("El resultado de la hipotenusa es "+p2.gethipotenusa());
                break;
            
           case 'b':
               /**
                * Declarar variables
                */
                System.out.println("Dame la hipotenusa");
                p2.sethipotenusa(teclado.nextDouble());
        
                System.out.println("Dame el segundo cateto");
                p2.setcateto2(teclado.nextDouble());
        
                /**
                 * Llamo la operación
                 */
                p2.operacion2(p2.gethipotenusa(), p2.getcateto2());
                
                /**
                 * Mostrar resultado
                 */
                System.out.println("El resultado del primer cateto es "+p2.getcateto1());
                break;
            
           case 'c':
               /**
                * Declarar variables
                */
                System.out.println("Dame el primer cateto");
                p2.setcateto1(teclado.nextDouble());
        
                System.out.println("Dame la hipotenusa");
                p2.sethipotenusa(teclado.nextDouble());
        
                /**
                 * Llamo la operación
                 */
                p2.operacion1(p2.getcateto1(), p2.gethipotenusa());
                
                /**
                 * Mostrar resultado
                 */
                System.out.println("El resultado del segundo cateto es "+p2.getcateto2());
                break;
               
               
       }

    }
    
}
