/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg77;

/**
 *
 * @author adrian
 */
public class Operaciones {
    /**
     * Declarar variables
     */
    private float radio;
    private double result;
    
    /**
     * Hago el setter
     * @param radio este parametro es el del radio
     */
    public void setradio(float radio){
        this.radio=radio;
    }
    /**
     * Hago el setter
     * @param result este parametro es el del resultado
     */
    public void setresult(float result){
    this.result=result;
    }
    
    /**
     * Hago los getters
     * @return radio
     */
    public float getradio(){
    return radio;
    }
    /**
     * Hago los getters
     * @return result
     */
    public double getresult(){
    return result;
    }
    
    /**
     * Hago las operaciones
     * @param radio este parametro es el del radio
     */
    public void longitud(float radio){
        this.result=2*Math.PI*radio;
    }
    /**
     * Hago las operaciones
     * @param radio este parametro es el del radio
     */
    public void area(float radio){
        this.result=Math.PI*Math.pow(radio, 2);
    }
}
