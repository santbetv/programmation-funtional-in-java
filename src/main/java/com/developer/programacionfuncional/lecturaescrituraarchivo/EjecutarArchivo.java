/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.developer.programacionfuncional.lecturaescrituraarchivo;

/**
 *
 * @author santiago
 */
public class EjecutarArchivo {

    public static void main(String[] args) {
        Archivo archivo = new Archivo();
        archivo.leerArchivo();
        archivo.escribirEnArchivo();
    }

}
