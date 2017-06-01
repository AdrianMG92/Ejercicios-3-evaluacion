/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra3;

/**
 *
 * @author adrian
 */
public class Operaciones {
    /**
     * Declaro las variables
     */
    private double pies;
    private double yardas;
    private double pulgadas;
    private double centimetros;
    
    /**
     * Hago el setter
     * @param pies este parametro es el de los pies
     */
    public void setpies(double pies){
        this.pies=pies;
    }
    /**
     * Hago el setter
     * @param yardas este parametro es el de las yardas
     */
    public void setyardas(double yardas){
        this.yardas=yardas;
    }
    /**
     * Hago el setter
     * @param pulgadas este parametro es el de las pulgadas
     */
    public void setpulgadas(double pulgadas){
        this.pulgadas=pulgadas;
    }
    /**
     * Hago el setter
     * @param centimetros este parametro es el de los centimetros
     */
    public void setcentimetros(double centimetros){
        this.centimetros=centimetros;
    }
    
    /**
     * Hago la operacion
     * @param pies este parametro es el de los pies
     */
    public void opeyardas(double pies){
        yardas=pies/0.33;
    }
    /**
     * Hago la operacion
     * @param pies este parametro es el de los pies
     */
    public void opepulgadas(double pies){
        pulgadas=pies/12;
    }
    /**
     * Hago la operacion
     * @param pies este parametro es el de los pies
     */
    public void opecentimetros(double pies){
        centimetros=pies*30.48;
    }
    
    /**
     * Hago el getter
     * @return pies
     */
    public double getpies(){
        return pies;
    } 
    /**
     * Hago el getter
     * @return yardas
     */
    public double getyardas(){
        return yardas;
    }
    /**
     * Hago el getter
     * @return pulgadas
     */
    public double getpulgadas(){
        return pulgadas;
    }
    /**
     * Hago el getter
     * @return centimetros
     */
    public double getcentimetros(){
        return centimetros;
    }
}
