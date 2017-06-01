/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg86;

import java.util.Scanner;

/**
 *
 * @author adrian
 */
public class Practica86 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Declarar objetos
         */
        Menu m = new Menu();
        Contador c1 = new Contador();
        
        /**
         * Entrada por teclado
         */
        Scanner teclado= new Scanner (System.in);
        
        /**
         * Boolean para el menu
         */
        boolean finalizar=false;
        
        /**
         * Condción del menu creando el bucle para que se repita el menu a no ser que se salga de el con el comando establecido
         */
        while(finalizar==false){
            m.setmostrar();
            m.setopcion();
            /**
             * hago el if para que me salga del menu si apreto a la s
             */
            if(m.getopcion()=='s'){
                finalizar=true;
            }
            /**
             * hago el otro if por si se apreta un comando no establecido
             */
            else if(m.getopcion()!='i' && m.getopcion()!='d'){
                System.out.println("La opción que ha puesto es errónea");
                System.out.println();
            }
            else{
                /**
                 * creo el switch para cada opcion del menu
                 */
                switch(m.getopcion()){
                    case 'i':
                        System.out.println("¿Hasta que número deseas llegar");
                        c1.setlimite(teclado.nextInt());
                        c1.incrementar(c1.getlimite());
                        break;
                        
                    case 'd':
                        System.out.println("¿Desde que número deseas empezar a bajar?");
                        c1.setlimite(teclado.nextInt());
                        c1.decrementar(c1.getlimite());
                        break;
                }
            }
    }
    
}
}
