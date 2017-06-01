/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra02;

import java.util.Scanner;

/**
 *
 * @author adrian
 */
public class Extra02 {

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
         * Declarar dinero
         */
        System.out.println("¿Cuántos segundos quieres introducir?");
        p1.setsegundos(teclado.nextInt());

        /**
         * Llamo a la operacion
         */
        p1.operacion(p1.getsegundos(), p1.gettiemposec(), p1.gettiempoarray());
        
        /**
         * Mostrar resultado haciendo el bucle para mostrar el tiempo del array del objeto 1 por 1
         */
        for(int i=0; i<5; i++){
            if(p1.gettiempoarray()[i]>0){
                System.out.println(p1.gettiempoarray()[i]+" "+p1.getnombre()[i]);
            }
        }
    }
    
}
