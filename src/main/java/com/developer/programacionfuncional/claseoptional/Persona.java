/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.developer.programacionfuncional.claseoptional;

/**
 *
 * @author santiago betancur
 */
public class Persona {
    
    private Integer id;
    private String nombre;

    public Persona(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Persona() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
