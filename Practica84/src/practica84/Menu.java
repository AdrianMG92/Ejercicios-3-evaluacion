/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica84;

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
    private char opciones2;
    private Scanner read= new Scanner(System.in);
    
    /**
     * Hago el setter
     */
    public void setMenu(){
        opciones='.';
    }
    /**
     * Hago el setter
     */
    public void setmostrar(){
        System.out.println("¿A qué cuenta deseas acceder?");
        System.out.println("a=cuenta1");
        System.out.println("b=cuenta2");
        System.out.println("s=salir");
    }
    /**
     * Hago el setter
     */
    public void setopcion(){
        this.opciones=read.next().charAt(0);
        System.out.println();
    }
    /**
     * Hago el getter de la eleccion del menu 1
     * @return opciones
     */
    public char getopcion(){
        return opciones;
    }
    /**
     * Hago el setter
     */
    public void setMenu2(){
        opciones='.';
    }
    /**
     * Hago el setter del 2º menu
     */
    public void setmostrar2(){
        System.out.println("¿Qué desea hacer?");
        System.out.println("i=ingresar");
        System.out.println("r=reintegro");
        System.out.println("t=transferencia");
        System.out.println("m=mostrar saldo");
        System.out.println("d=datos personales");
        System.out.println("f=finalizar transacciones");
    }
    /**
     * Hago el setter
     */
    public void setopcion2(){
        this.opciones2=read.next().charAt(0);
        System.out.println();
    }
    /**
     * Hago el getter de la eleccion del menu 2
     * @return opciones 2
     */
    public char getopcion2(){
        return opciones2;
    }
    /**
     * Hago una variable para reiniciar la eleccion del menu 2
     */
    public void reiniciaropcion2(){
        opciones2='.';
    }
}
