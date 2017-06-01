/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg86;

/**
 *
 * @author adrian
 */
public class Contador {
    /**
     * Declaro variables
     */
    int contador=0;
    int limite;


/**
 * Constructor por defecto
 */
    public Contador(){
        contador=1;
    }
    
    /**
     * Constructor con parámetros
     * @param contador este parametro es la del contador que pide el ejercicio
     */
    public Contador(int contador){
        this.contador=contador;
    }
    
    /**
     * Constructor copia
     * @param c este parametro es para la copia
     */
    public Contador(final Contador c){
        contador=c.contador;
    }
    
    /**
     * Hago el setter
     * @param contador este parametro es la del contador que pide el ejercicio
     */
    public void setcontador(int contador){
        this.contador=contador;
    }
    /**
     * Hago el setter
     * @param limite este parametro es para el limite que preguntamos al usuario
     */
    public void setlimite(int limite){
        this.limite=limite;
    }
    
    /**
     * Hago la operación
     * @param limite este parametro es para el limite que preguntamos al usuario
     */
    public void incrementar(double limite){
        /**
         * creo un bucle para que se vaya sumando el numero de 1 en 1
         */
        while(contador<=limite){
            System.out.println(contador);
            contador++;
        }
    }
    /**
     * Hago la operación
     * @param limite este parametro es para el limite que preguntamos al usuario
     */
    public void decrementar(double limite){
        /**
         * creo un bucle para que se vaya restando el numero de 1 en 1
         */
        while(limite>0){
            System.out.println(limite);
            limite--;
        }
    }
    
    /**
     * Hago el getter
     * @return contador
     */
    public int getcontador(){
        return contador;
    }
    /**
     * Hago el getter
     * @return limite
     */
    public int getlimite(){
        return limite;
    }
}