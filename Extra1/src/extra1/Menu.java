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
public class Menu {
    private char opciones;
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
        System.out.println("a=hipotenusa");
        System.out.println("b=cateto1");
        System.out.println("c=cateto2");
    }
    /**
     * Hago el setter
     */
    public void setopcion(){
        this.opciones=read.next().charAt(0);
        System.out.println();
    }
    /**
     * @return opcion
     */
    public char getopcion(){
        return opciones;
    }
    
}
