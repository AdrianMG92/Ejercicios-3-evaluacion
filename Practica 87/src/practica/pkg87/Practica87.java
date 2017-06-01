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
public class Practica87 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu m = new Menu();
        Libro c1 = new Libro("El silmarillion", "Tolkien", 1);
        Libro c2 = new Libro("Tú, simplemente tú", "Federico Moccia", 1);
        
        //Entrada por teclado
        Scanner teclado= new Scanner (System.in);
        
        //Boolean para el menu
        boolean finalizar=false;
        
        //Condción del menu
        while(finalizar==false){ //creo el 1º bucle para el 1º menu para que repita repita la operacion a no ser que se meta el comando establecido para finalizar
            m.setmostrar();
            m.setopcion();
            
            if(m.getopcion()=='s'){//creo el if para que salga del programa si se apreta la s
                finalizar=true;
            }
            else if(m.getopcion()!='a' && m.getopcion()!='b'){//creo el if por si se apreta un comando no establecido
                System.out.println("El libro que ha puesto es erróneo");
                System.out.println();
            }
            else{
                while(m.getopcion2()!='f'){//creo el 2º bucle para el 1º menu para que repita repita la operacion a no ser que se meta el comando establecido para finalizar
                    m.setmostrar2();
                    m.setopcion2();
                    //Hago el switch
                    switch (m.getopcion2()){//creo el switch para cada caso
                        case 'p':
                            if(m.getopcion()=='a'){ //creo los if en cada caso teniendo en cuenta a que opcion entremos en el 1º menu
                                if(c1.getejemplares()==1){
                                    c1.prestamo();
                                    System.out.println("El prestamo se ha finalizado con éxito");
                                }
                                else{
                                    System.out.println("No quedan ejemplares de este libro");
                                }
                            }
                            else{
                                if(c2.getejemplares()==1){
                                    c2.prestamo();
                                    System.out.println("El prestamo se ha finalizado con éxito");
                                }
                                else{
                                    System.out.println("No quedan ejemplares de este libro");
                                }
                                
                            }
                            break;
                            
                        case 'd':
                            if(m.getopcion()=='a'){
                                if(c1.getejemplares()==0){
                                    c1.devolucion();
                                    System.out.println("La devolucion se ha finalizado con éxito");
                                }
                                else{
                                    System.out.println("Los ejemplares de este libro están completos");
                                }
                            }
                            else{
                                if(c2.getejemplares()==0){
                                    c2.prestamo();
                                    System.out.println("La devolucion se ha finalizado con éxito");
                                }
                                else{
                                    System.out.println("Los ejemplares de este libro están completos");
                                }
                                
                            }
                            break;

                        case 'm':
                            if(m.getopcion()=='a'){
                                System.out.println("Título: "+c1.gettitulo());
                                System.out.println("Autor: "+c1.getautor());
                                System.out.println("Ejemplares: "+c1.getejemplares());
                            }
                            else{
                                System.out.println("Título: "+c2.gettitulo());
                                System.out.println("Autor: "+c2.getautor());
                                System.out.println("Ejemplares: "+c2.getejemplares());
                            }
                            break;
                    }
                }//cierro el 2º bucle
                m.reiniciaropcion2();//hago que se reinicie la 2º eleccion del menu 2
            }
        }//cierro el 1º bucle
    
}
}
