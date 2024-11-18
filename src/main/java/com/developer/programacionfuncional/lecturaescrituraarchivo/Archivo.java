/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.developer.programacionfuncional.lecturaescrituraarchivo;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 * 
 * @author santiago betancur
 */
public class Archivo {

    //Metodos de readString y writeString
    //Vinculados a java 11 para su utilizacion en archivos
    
    public void leerArchivo() {
        try {
            String contenido = Files.readString(Path.of("src/main/java/com/developer/programacionfuncional/lecturaescrituraarchivo/prueba.txt"));
            System.out.println(contenido);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void escribirEnArchivo() {
        try {
            Path path = Files.writeString(Path.of("/home/rizzoli/Documentos/intellijIDEA/exercises/ProgramacionFuncional/src/main/java/com/developer/programacionfuncional/lecturaescrituraarchivo/pruebaa.txt"),
                    "Java 11",
                    StandardOpenOption.CREATE, // Cambiado a CREATE para permitir escritura en archivos existentes
                    StandardOpenOption.TRUNCATE_EXISTING); // Opcional: sobrescribe el contenido si el archivo ya existe
            System.out.println(path);
            String s = Files.readString(path);
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
