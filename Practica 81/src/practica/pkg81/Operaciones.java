/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg81;

/**
 *
 * @author adrian
 */
public class Operaciones {
    /**
     * Declaro las variables
     */
    private float radio;
    private double result;
    
    /**
     * Hago el setter
     * @param radio este parametro es la del radio
     */
    public void setradio(float radio){
        this.radio=radio;
    }
    /**
     * Hago el setter
     * @param result este parametro es el del resultado
     */
    public void setresult(double result){
        this.result=result;
    }
    
    /**
     * Hago el getter
     * @return radio
     */
    public float getradio(){
        return radio;
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
     * @param radio este parametro es la del radio
     */
    public void volumen(float radio){
        this.result=(4*Math.PI*Math.pow(radio, 3))/3;
    }
}
