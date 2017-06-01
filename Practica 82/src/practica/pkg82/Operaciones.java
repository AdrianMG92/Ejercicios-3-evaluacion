/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg82;

/**
 *
 * @author adrian
 */
public class Operaciones {
    /**
     * Declaro las variables
     */
    private int dinero;
    private int [] billetesarray = new int [9];
    int i=0;
    int [] desglose= {500,200,100,50,20,10,5,2,1};
    
    /**
     * Hago el setter
     * @param dinero esta variable es la del dinero introducido
     */
    public void setdinero(int dinero){
        this.dinero=dinero;
    }
    
    /**
     * Hago el setter
     * @param desglose esta variable es la del desglose de tipo de billetes y monedas para sacar el resto
     */
    public void setdesglose(int [] desglose){
        this.desglose=desglose;
}
    
    /**
     * Hago el setter
     * @param billetesarray esta variable es la del array que debe mostrar finalmente el ejercicio
     */
    public void setbilletes(int[] billetesarray){
        this.billetesarray=billetesarray;
    }
    
    /**
     * Hago el getter
     * @return dinero
     */
    public int getdinero(){
        return dinero;
    }
    /**
     * Hago el getter
     * @return desglose
     */
    public int [] getdesglose(){
        return desglose;
    }
    
    /**
     * Hago las operaciones iniciando el bucle para que me coja el desglose por separado dentro del array a la vez que en el array de los billetes
     * @param dinero esta variable es la del dinero introducido
     * @param desglose esta variable es la del desglose de tipo de billetes y monedas para sacar el resto
     * @param billetesarray esta variable es la del array que debe mostrar finalmente el ejercicio
     */
    public void operacion(int dinero, int[] desglose, int[] billetesarray){
        for(i=0; i<9; i++){
            billetesarray[i]= (dinero/desglose [i]);
            dinero=dinero%desglose [i];
        }
    }
    
    /**
     * Hago el getter
     * @return billetesarray
     */
    public int [] getbilletes(){
        return billetesarray;
    }
    
}
