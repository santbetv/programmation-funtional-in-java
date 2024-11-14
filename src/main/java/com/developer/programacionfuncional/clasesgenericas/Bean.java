/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.developer.programacionfuncional.clasesgenericas;

/**
 *
 * @author santiago betancur
 * @param <T>
 */
public class Bean<T> {

    private T dato;

    public Bean(T dato) {
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    //comodin ? de cualquier tipo
    public static  void mostrarDato(Bean<?> bean) {
        System.out.println(bean.dato);
    }

}
