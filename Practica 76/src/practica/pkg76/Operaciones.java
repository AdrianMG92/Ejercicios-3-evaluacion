/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg76;

/**
 *
 * @author adrian
 */
public class Operaciones {
    /**
     * Declaro las variables
     */
    private float suma, resta, multiplicacion, division, resto;
    
    /**
     * Hago el setter
     * @param valor1 este es el parametro del valor 1
     * @param valor2 este es el parametro del valor 2
     */
public void setsuma(float valor1, float valor2){
    this.suma=valor1 + valor2;
}
/**
     * Hago el setter
     * @param valor1 este es el parametro del valor 1
     * @param valor2 este es el parametro del valor 2
     */
public void setresta(float valor1, float valor2){
    this.resta=valor1 - valor2;
}
/**
     * Hago el setter
     * @param valor1 este es el parametro del valor 1
     * @param valor2 este es el parametro del valor 2
     */
public void setmult(float valor1, float valor2){
    this.multiplicacion=valor1 * valor2;
}
/**
     * Hago el setter
     * @param valor1 este es el parametro del valor 1
     * @param valor2 este es el parametro del valor 2
     */
public void setdiv(float valor1, float valor2){
    this.division=valor1 / valor2;
}
/**
     * Hago el setter
     * @param valor1 este es el parametro del valor 1
     * @param valor2 este es el parametro del valor 2
     */
public void setres(float valor1, float valor2){
    this.resto=valor1 % valor2;
}
/**
 * Hago los getters
 * @return suma
 */
public float getsuma(){
    return suma;
}
/**
 * Hago los getters
 * @return resta
 */
public float getresta(){
    return resta;
}
/**
 * Hago los getters
 * @return multiplicacion
 */
public float getmult(){
    return multiplicacion;
}
/**
 * Hago los getters
 * @return division
 */
public float getdiv(){
    return division;
}
/**
 * Hago los getters
 * @return resto
 */
public float getres(){
    return resto;
}
    
}
