/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg87;

import java.util.Scanner;

/**
 *
 * @author adrian
 */
public class Menu {
    private char opciones;
    private char opciones2;
    private Scanner read= new Scanner(System.in);
    
    public void setMenu(){
        opciones='.';
    }
    
    public void setmostrar(){
        System.out.println("¿A qué libro desea acceder?");
        System.out.println("a=libro1");
        System.out.println("b=libro2");
        System.out.println("s=salir");
    }
    public void setopcion(){
        this.opciones=read.next().charAt(0);
        System.out.println();
    }
    public char getopcion(){
        return opciones;
    }
    
    public void setMenu2(){
        opciones='.';
    }
    
    public void setmostrar2(){
        System.out.println("¿Qué deseas hacer?");
        System.out.println("p=préstamo");
        System.out.println("d=devolución");
        System.out.println("m=mostrar libro");
        System.out.println("f=finalizar");
    }
    public void setopcion2(){
        this.opciones2=read.next().charAt(0);
        System.out.println();
    }
    public char getopcion2(){
        return opciones2;
    }
    public void reiniciaropcion2(){
        opciones2='.';
    }
}
