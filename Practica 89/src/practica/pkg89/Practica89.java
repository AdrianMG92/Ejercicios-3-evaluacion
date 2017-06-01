/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg89;

import java.util.Scanner;

/**
 *
 * @author adrian
 */
public class Practica89 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Declaro los objetos
         */
        Menu m = new Menu();
        Fecha c1 = new Fecha();
        
        /**
         * Entrada por teclado
         */
        Scanner teclado= new Scanner (System.in);
        
        /**
         * Boolean para el menu
         */
        boolean finalizar=false;
        /**
         * bucle del menu para que finalice cuando yo lo pido
         */    
        while(finalizar==false){
            m.setmostrar();
            m.setopcion();
            /**
             * creo condiciones para cada opcion del menu, contemplando si te equivocas al apretar
             */
            if(m.getopcion()=='s'){
                finalizar=true;
            }
            else if(m.getopcion()!='m' && m.getopcion()!='v'){
                System.out.println("La opción que pone no es correcta");
                System.out.println();
            }
            else{
                if(m.getopcion()=='m'){
                    c1.fechaactual(c1.getdia(), c1.getmes(), c1.getaño());
                    System.out.println("La fecha actual es:");
                    System.out.println("El "+c1.getdia()+" del "+c1.getmes()+" del "+c1.getaño());
                }
                else{
                    System.out.println("Introduce una fecha");
                    System.out.println("¿Qué dia quieres introducir?");
                    c1.setdia(teclado.nextInt());
                    System.out.println("¿Qué mes quieres introducir?");
                    c1.setmes(teclado.nextInt());
                    System.out.println("¿Qué año quieres introducir?");
                    c1.setaño(teclado.nextInt());
                    
                    c1.fechavalida(c1.getdia(), c1.getmes(), c1.getaño());
                }
            }
    }
    
}
}
