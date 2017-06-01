/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica84;

/**
 *
 * @author adrian
 */
public class Cuenta {
    /**
     * Declarar variables
     */
    private String nombre, apellido1, apellido2, dni, numero_cuenta, tipo_interes;
    private double dinero;
    private double saldo=0;
    
    /**
     * Constructor por defecto
     */
    public Cuenta(){
        nombre="";
        apellido1="";
        apellido2="";
        dni="";
        numero_cuenta="";
        tipo_interes="";
    }
    
    /**
     * Constructor con parámetros
     * @param nombre este parametro es para el nombre
     * @param apellido1 este parametro es para el 1º apellido
     * @param apellido2 esta parametro es para el 2º apellido
     * @param dni este parametro es para el dni
     * @param numero_cuenta este parametro es para en numero de cuenta
     * @param tipo_interes este parametro es para el tipo de interes
     */
    public Cuenta(String nombre, String apellido1, String apellido2, String dni, String numero_cuenta, String tipo_interes){
        this.nombre=nombre;
        this.apellido1=apellido1;
        this.apellido2=apellido2;
        this.dni=dni;
        this.numero_cuenta=numero_cuenta;
        this.tipo_interes=tipo_interes;
    }
    
    /**
     * Constructor copia
     * @param c parametro de la copia
     */
    public Cuenta(final Cuenta c){
        nombre=c.nombre;
        apellido1=c.apellido1;
        apellido2=c.apellido2;
        dni=c.dni;
        numero_cuenta=c.numero_cuenta;
        tipo_interes=c.tipo_interes;
    }
    
    /**
     * Hago el setter
     * @param saldo este parametro es la del saldo
     */
    public void setsaldo(double saldo){
        this.saldo=saldo;
    }
    /**
     * /Hago el setter
     * @param dinero este parametro es la del dinero
     */
    public void setdinero(double dinero){
        this.dinero=dinero;
    }
    /**
     * Hago el setter
     * @param nombre este parametro es la del nombre
     */
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    /**
     * Hago el setter
     * @param apellido1 este parametro es la del 1º apellido
     */
    public void setapellido1(String apellido1){
        this.apellido1=apellido1;
    }
    /**
     * Hago el setter
     * @param apellido2 este parametro es la del 2º apellido
     */
    public void setapellido2(String apellido2){
        this.apellido2=apellido2;
    }
    /**
     * Hago el setter
     * @param dni este parametro es la del dni
     */
    public void setdni(String dni){
        this.dni=dni;
    }
    /**
     * Hago el setter
     * @param numero_cuenta este parametro es la del numero de cuenta
     */
    public void setnumero_cuenta(String numero_cuenta){
        this.numero_cuenta=numero_cuenta;
    }
    /**
     * Hago el setter
     * @param tipo_interes este parametro es la del tipo de interes
     */
    public void settipo_interes(String tipo_interes){
        this.tipo_interes=tipo_interes;
    }
    
    /**
     * Hago la operacion
     * @param dinero este parametro es la del dinero
     */
    public void saldoingreso(double dinero){
        saldo=saldo+dinero;
    }
    /**
     * Hago la operacion
     * @param dinero este parametro es la del dinero
     */
    public void saldoreintegro(double dinero){
        saldo=saldo-dinero;
    }
    /**
     * Hago la operacion
     * @param dinero este parametro es la del dinero
     */
    public void saldotransferencia(double dinero){
        saldo=saldo-dinero;
    }
    
    /**
     * Hago el getter
     * @return saldo
     */
    public double getsaldo(){
        return saldo;
    }
    /**
     * Hago el getter
     * @return dinero
     */
    public double getdinero(){
        return dinero;
    }
    /**
     * Hago el getter
     * @return nombre
     */
    public String getnombre(){
        return nombre;
    }
    /**
     * Hago el getter
     * @return apellido1
     */
    public String getapellido1(){
        return apellido1;
    }
    /**
     * Hago el getter
     * @return apellido2
     */
    public String getapellido2(){
        return apellido2;
    }
    /**
     * Hago el getter
     * @return dni
     */
    public String getdni(){
        return dni;
    }
    /**
     * Hago el getter
     * @return numero de cuenta
     */
    public String getnumero_cuenta(){
        return numero_cuenta;
    }
    /**
     * Hago el getter
     * @return tipo de interes
     */
    public String gettipo_interes(){
        return tipo_interes;
    }
}
