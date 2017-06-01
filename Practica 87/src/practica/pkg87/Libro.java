/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg87;

/**
 *
 * @author adrian
 */
public class Libro {
    /**
     * Declarar variables
     */
    private String titulo, autor;
    private int ejemplares=1;

    /**
     * Constructor con parámetros
     * @param titulo este parametro es para el titulo del libro
     * @param autor este parametro es para el autor del libro
     * @param ejemplares este parametro es para los ejemplares del libro
     */
    public Libro(String titulo, String autor, int ejemplares){
        this.titulo=titulo;
        this.autor=autor;
        this.ejemplares=ejemplares;
    }
    
    /**
     * Hago el setter
     * @param titulo este parametro es para el titulo del libro
     */
    public void settitulo(String titulo){
        this.titulo=titulo;
    }
    /**
     * Hago el setter
     * @param autor este parametro es para el autor del libro
     */
    public void setautor(String autor){
        this.autor=autor;
    }
    /**
     * Hago el setter
     * @param ejemplares este parametro es para los ejemplares del libro
     */
    public void setejemplares(int ejemplares){
        this.ejemplares=ejemplares;
    }
    
    /**
     * Hago la operacion
     */
    public void prestamo(){
        ejemplares=ejemplares-1;
    }
    /**
     * este parametro es para el titulo del libro
     */
    public void devolucion(){
        ejemplares=ejemplares+1;
    }
    
    /**
     * Hago el getter
     * @return titulo
     */
    public String gettitulo(){
        return titulo;
    }
    /**
     * Hago el getter
     * @return autor
     */
    public String getautor(){
        return autor;
    }
    /**
     * Hago el getter
     * @return ejemplares
     */
    public int getejemplares(){
        return ejemplares;
    }
}
