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
public class Practica76 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Declaro valores
         */
        char selec;
        float valor1, valor2, result;
        
        /**
         * inicializo los objetos del menu y las operaciones
         */
        Menu p1 = new Menu();
        Operaciones p2 = new Operaciones();
        p1.mostrar();

        
        selec=p1.leer();
        Scanner s=new Scanner(System.in);
        
        /**
         * Hago el switch para cada operacion de la calculadora
         */
        switch (selec){
            case 's':
                System.out.println("¿Qué números deseas sumar?");
                valor1=s.nextFloat();
                valor2=s.nextFloat();
                p2.setsuma(valor1, valor2);
                System.out.println("El resultado es "+p2.getsuma());
                break;
            case 'r':
                System.out.println("¿Qué números deseas restar?");
                valor1=s.nextFloat();
                valor2=s.nextFloat();
                p2.setresta(valor1, valor2);
                System.out.println("El resultado es "+p2.getresta());
                break;
            case 'm':
                System.out.println("¿Qué números deseas multiplicar?");
                valor1=s.nextFloat();
                valor2=s.nextFloat();
                p2.setmult(valor1, valor2);
                System.out.println("El resultado es "+p2.getmult());
                break;
            case 'd':
                System.out.println("¿Qué números deseas dividir?");
                valor1=s.nextFloat();
                valor2=s.nextFloat();
                p2.setdiv(valor1, valor2);
                System.out.println("El resultado es "+p2.getdiv());
                break;
            case 'x':
                System.out.println("¿Qué números deseas restar?");
                valor1=s.nextFloat();
                valor2=s.nextFloat();
                p2.setres(valor1, valor2);
                System.out.println("El resultado es "+p2.getres());
                break;
            default:
        }
        
        
    }
    
}
