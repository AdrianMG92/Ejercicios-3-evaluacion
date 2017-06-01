/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg79;

/**
 *
 * @author adrian
 */
public class Operaciones {
    /**
     * Declaro las variables
     */
    private float lado, apotema;
    private double result;
    
    /**
     * Hago el setter
     * @param lado este parametro es la del lado
     */
    public void setlado(float lado){
        this.lado=lado;
    }
    /**
     * Hago el setter
     * @param apotema este parametro es la del apotema
     */
    public void setapotema(float apotema){
        this.apotema=apotema;
    }
    /**
     * Hago el setter
     * @param result este parametro es la del resultado
     */
    public void setresult(double result){
        this.result=result;
    }
    
    /**
     * Hago el getter
     * @return lado
     */
    public float getlado(){
        return lado;
    }
    /**
     * Hago el getter
     * @return apotema
     */
    public float getapotema(){
        return apotema; 
    }
    /**
     * Hago el getter
     * @return result
     */
    public double getresult(){
        return result;
    }
    
    /**
     * Hago las operaciones
     * @param lado este parametro es la del lado
     * @param apotema este parametro es la del apotema
     */
    public void area(float lado, float apotema){
        this.result=(lado*apotema)/2;
    }
}
