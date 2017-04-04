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
    private float suma, resta, multiplicacion, division, resto;
    
public void setsuma(float valor1, float valor2){
    this.suma=valor1 + valor2;
}
public void setresta(float valor1, float valor2){
    this.resta=valor1 - valor2;
}
public void setmult(float valor1, float valor2){
    this.multiplicacion=valor1 * valor2;
}
public void setdiv(float valor1, float valor2){
    this.division=valor1 / valor2;
}
public void setres(float valor1, float valor2){
    this.resto=valor1 % valor2;
}
public float getsuma(){
    return suma;
}
public float getresta(){
    return resta;
}
public float getmult(){
    return multiplicacion;
}
public float getdiv(){
    return division;
}
public float getres(){
    return resto;
}
    
}
