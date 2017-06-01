/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra02;

/**
 *
 * @author adrian
 */
public class Operaciones {
    /**
     * Declaro las variables
     */
    private int segundos;
    private int [] tiempoarray = new int [5];
    int i=0;
    int [] tiemposec= {604800, 86400, 3600, 60, 1};
    private String[] nombre = {"semanas", "dias", "horas", "minutos", "segundos"};
    
    /**
     * Hago el setter
     * @param segundos este parametro es para los segundos que introduces
     */
    public void setsegundos(int segundos){
        this.segundos=segundos;
    }
    /**
     * Hago el setter
     * @param tiempoarray este parametro es para el array de lo que tiene que devolver al final el programa
     */
    public void settiempoarray(int [] tiempoarray){
        this.tiempoarray=tiempoarray;
}
    /**
     * Hago el setter
     * @param tiemposec este parametro es el array del desglose para sacar el resto
     */
    public void settiemposec(int[] tiemposec){
        this.tiemposec=tiemposec;
    }
    
    /**
     * Hago el setter
     * @param nombre este parametro es un array de los nombres de minutos, segundos, etc
     */
    public void settnombre(String[] nombre){
        this.nombre=nombre;
    }
    
    /**
     * Hago el getter
     * @return segundos
     */
    public int getsegundos(){
        return segundos;
    }
    
    /**
     * Hago el getter
     * @return tiemposec 
     */
    public int [] gettiemposec(){
        return tiemposec;
    }
    
    /**
     * Hago el getter
     * @return nombre
     */
    public String [] getnombre(){
        return nombre;
    }
    
    /**
     * Hacer la operación
     * @param segundos este parametro es para los segundos que introduces
     * @param tiemposec este parametro es el array del desglose para sacar el resto
     * @param tiempoarray este parametro es para el array de lo que tiene que devolver al final el programa
     */
    public void operacion(int segundos, int[] tiemposec, int[] tiempoarray){
        for(i=0; i<5; i++){//hago el bucle para que me recorra el array del tiempo a la vez que la del desglose de los segundos
            tiempoarray[i]= (segundos/tiemposec [i]);
            segundos=segundos%tiemposec [i];
        }
    }
    
    /**
     * Hago el getter
     * @return tiempoarray
     */
    public int [] gettiempoarray(){
        return tiempoarray;
    }
}
