/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra1;

/**
 *
 * @author adrian
 */
public class Operaciones {
    private double cateto1;
    private double cateto2;
    private double hipotenusa;
    
    /**
     * Hago el setter
     * @param cateto1 este es el parametro para el 1º cateto
     */
    public void setcateto1(double cateto1){
        this.cateto1=cateto1;
    }
    /**
     * Hago el setter
     * @param cateto2 este es el parametro para el 2º cateto
     */
    public void setcateto2(double cateto2){
        this.cateto2=cateto2;
    }
    /**
     * Hago el setter
     * @param hipotenusa este es el parametro para la hipotenusa
     */
    public void sethipotenusa(double hipotenusa){
        this.hipotenusa=hipotenusa;
    }
    
    /**
     * Hago la operacion
     * @param cateto1 este es el parametro para el primer cateto
     * @param cateto2 este es el parametro para el 2º cateto
     */
    public void operacion1(double cateto1, double cateto2){
        hipotenusa=(float) Math.sqrt((float) ((float) Math.pow(cateto2,2) + (float) Math.pow(cateto1,2)));
    }
    /**
     * hago la operacion
     * @param hipotenusa este es el parametro para la hipotenusa
     * @param cateto2 este es el parametro para el 2º cateto
     */
    public void operacion2(double hipotenusa, double cateto2){
        cateto1=Math.sqrt(Math.pow(hipotenusa, 2)-Math.pow(cateto2, 2));
    }
    /**
     * hago la operacion
     * @param cateto1 este es el parametro para el 1º cateto
     * @param hipotenusa este es el parametro para la hipotenusa
     */
    public void operacion3(double cateto1, double hipotenusa){
        cateto2=Math.sqrt(Math.pow(hipotenusa, 2)-Math.pow(cateto1, 2));
    }
    
    /**
     * @return cateto1 
     */
    public double getcateto1(){
        return cateto1;
    } 
    /**
     * @return cateto 2
     */
    public double getcateto2(){
        return cateto2;
    }
    /**
     * @return hipotenusa
     */
    public double gethipotenusa(){
        return hipotenusa;
    }
    
}
