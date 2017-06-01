/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg80;

/**
 *
 * @author adrian
 */
public class Operaciones {
    /**
     * Declaro las variables
     */
    private float arista;
    private double result;
    
    /**
     * Hago el setter
     * @param arista este es el parametro de la arista
     */
    public void setarista(float arista){
        this.arista=arista;
    }
    /**
     * Hago el setter
     * @param result este es el parametro del resultado
     */
    public void setresult(double result){
        this.result=result;
    }
    
    /**
     * Hago el getter
     * @return arista
     */
    public float getarista(){
        return arista;
    }
    /**
     * Hago el getter
     * @return resultado
     */
    public double getresult(){
        return result;
    }
    
    /**
     * Hago la operacion
     * @param arista este es el parametro de la arista
     */
    public void area(float arista){
        this.result=6*Math.pow(arista, 2);
    }
}
