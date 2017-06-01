/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.pkg83;

/**
 *
 * @author adrian
 */
public class Operaciones {
    /**
     * Declaro las variables
     */
   private double x;
   private double x2;
   private double x3;
   private double result1;
   private double result2;
   
   /**
    * Hago el setter
    * @param x este parametro es el de la 1º variable
    */
    public void setx(double x){
        this.x=x;
    }
    /**
     * Hago el setter
     * @param x2 este parametro es el de la 2º variable
     */
    public void setx2(double x2){
        this.x2=x2;
    }
    /**
     * Hago el setter
     * @param x3 este parametro es el de la 3º variable
     */
    public void setx3(double x3){
        this.x3=x3;
    }
    /**
     * Hago el setter
     * @param result1 esta variable es la del 1º resultado
     */
    public void setresult1(double result1){
        this.result1=result1;
    }
    /**
     * Hago el setter
     * @param result2 esta variable es la del 2º resultado
     */
    public void setresult2(double result2){
        this.result2=result2;
    }
    
    /**
     * Hago el getter
     * @return x
     */
    public double getx(){
        return x;
    }
    /**
     * Hago el getter
     * @return x2
     */
    public double getx2(){
        return x2;
    }
    /**
     * Hago el getter
     * @return x3
     */
    public double getx3(){
        return x3;
    }
    
    /**
     * Hago las operaciones
     * @param x este parametro es el de la 1º variable
     * @param x2 este parametro es el de la 2º variable
     * @param x3 este parametro es el de la 3º variable
     */
    public void operacion(double x, double x2, double x3){
         result1=(-x2+(Math.sqrt(Math.pow(x2,2)-4*x*x3)))/(x*2); 
         result2=(-x2-(Math.sqrt(Math.pow(x2,2)-4*x*x)))/(x*2);
    }
    
    /**
     * Hago el getter
     * @return result1
     */
    public double getresult1(){
        return result1;
    }
    /**
     * Hago el getter
     * @return result2
     */
    public double getresult2(){
        return result2;
    }
}
