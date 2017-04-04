/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg76;

import java.util.Scanner;

/**
 *
 * @author adrian
 */
public class Menu {

public void mostrar(){
    System.out.println("s=suma");
    System.out.println("r=resta");
    System.out.println("m=multiplicación");
    System.out.println("d=división");
    System.out.println("x=resto");
}
public char leer(){
    Scanner teclado=new Scanner (System.in);
    System.out.println("¿Qué operación deseas hacer?");
    return teclado.next().charAt(0);
}

}
