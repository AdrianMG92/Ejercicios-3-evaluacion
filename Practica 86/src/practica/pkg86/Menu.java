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
public class Menu {
    /**
     * Declaro las variables
     */
    private char opciones;
    private Scanner read= new Scanner(System.in);
    /**
     * Hago el setter inicializando la opcion del menu
     */
    public void setMenu(){
        opciones='.';
    }
    /**
     * Hago el setter del menu
     */
    public void setmostrar(){
        System.out.println("¿Qué deseas hacer?");
        System.out.println("i=incrementar");
        System.out.println("d=decrementar");
        System.out.println("s=salir");
    }
    /**
     * Hago el setter de la eleccion
     */
    public void setopcion(){
        this.opciones=read.next().charAt(0);
        System.out.println();
    }
    /**
     * Hago el getter de la eleccion
     * @return opciones
     */
    public char getopcion(){
        return opciones;
    }
}
