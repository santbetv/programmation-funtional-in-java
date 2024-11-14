/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.developer.programacionfuncional.variablemetodostring;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 *
 * @author santiago betancur villegas
 */
public class VariableMetodosString {

    //metodo isBlank() nuevo elemento
    public void estaVacio(String texto) {
        System.out.println(texto.isBlank());
    }

    //Variables tipo var nuevo elemento desde java 10 
    //metodo repeat() nuevo elemento
    public void repetir(String texto, int Cantidad) {
        var reptidos = 0;
        var reptid = true;
        var reptido = texto.repeat(Cantidad);
        var datos = new ArrayList<Object>();
        System.out.println(reptido);
    }

    //Metodo lines() nuevo elemento que permite apartir de una cadena "1,2,3,4" esto lo pasa a una lista
    public void convertirLista(String texto) {
        System.out.println(texto.lines().collect(Collectors.toList()));
    }

    //Metodos para remover espacios
    public void removerEspacios(String texto) {
        System.out.println(texto.strip());//remover inicio y final
        System.out.println(texto.stripLeading()); //remover inicio
        System.out.println(texto.stripTrailing());//remover final
        System.out.println(texto.trim()); // remover inicio y final, pero si tiene formatos \n\t \u2005 se mantiene los espacios 
    }

    public static void main(String[] args) {

        VariableMetodosString elementos = new VariableMetodosString();
        elementos.estaVacio("");
        elementos.repetir("repite", 3);
        elementos.convertirLista("1,2,3,4");
        elementos.removerEspacios(" Hola ");
        elementos.removerEspacios("\n\t Hola \u2005");

    }

}
