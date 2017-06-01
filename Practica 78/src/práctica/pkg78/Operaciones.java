/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.pkg78;

/**
 *
 * @author adrian
 */
    
public class Operaciones {
    /**
     * Declarar las variables
     */
    private float base, altura;
    private double result;
    
    /**
     * Hago los setters
     * @param base este parametro es el de la base
     */
    public void setbase(float base){
        this.base=base;
    }
    /**
     * Hago los setters
     * @param altura este parametro es el de la altura
     */
    public void setaltura(float altura){
        this.altura=altura;
    }
    /**
     * Hago los setters
     * @param result este parametro es el del result
     */
    public void setresult(double result){
        this.result=result;
    }
    
    /**
     * Hago los getters
     * @return base
     */
    public float getbase(){
        return base;
    }
    /**
     * Hago los getters
     * @return altura
     */
    public float getaltura(){
        return altura; 
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
     * @param base este parametro es el de la base
     * @param altura este parametro es el de la altura
     */
    public void area(float base, float altura){
        this.result=base*altura;
    }
    
}

