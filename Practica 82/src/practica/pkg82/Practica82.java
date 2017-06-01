
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg82;

import java.util.Scanner;

/**
 *
 * @author adrian
 */
public class Practica82 {

    
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
         * Declarar dinero
         */
        System.out.println("¿Cuánto dinero tienes?");
        p1.setdinero(teclado.nextInt());

        /**
         * Llamo la operacion
         */
        p1.operacion(p1.getdinero(), p1.getdesglose(), p1.getbilletes());
        
        /**
         * Mostrar resultado llamando cada celda 1 por 1
         */
        for(int i=0; i<9; i++){
            if(p1.getbilletes()[i]>0){
                if(p1.getdesglose()[i]>2)
                    System.out.println("La cantidad de billetes de "+p1.getdesglose()[i]+" es de "+p1.getbilletes()[i]);
            
            else{
                System.out.println("La cantidad de monedas de "+p1.getdesglose()[i]+" es de "+p1.getbilletes()[i]);
            }
                
        }
            

        }
    }
    
}
