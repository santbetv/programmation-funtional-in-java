/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.developer.programacionfuncional.defaultinterface;

/**
 *
 * @author rizzoli
 */
public class ClaseValidadoraDeInterfaces implements IValidando3 {

    
    public static void main(String[] args) {
        ClaseValidadoraDeInterfaces claseValidadoraDeInterfaces = new ClaseValidadoraDeInterfaces();
        //Se utuliza metodo de IValidando1 desde implementacion de interface
        claseValidadoraDeInterfaces.enValidacionUno();
        
        //Se realiza llamado de metodo en sobreescritura, cambiando los datos por medio de default
        System.out.println(claseValidadoraDeInterfaces.valida());
        
        //Se realiza Polimorfismo y se accede al comportamiento del padre
        System.out.println(claseValidadoraDeInterfaces.validaEnCalseNormalPeroConPortamientoDeInterface1());
        System.out.println(claseValidadoraDeInterfaces.validaEnCalseNormalPeroConPortamientoDeInterface2());
        
        //Se realiza validacion de metodos static desde interface
        //Se maneja llamando desde interface
        System.out.println(IValidandoStatic.validando());
        
    }

    public int valida() {
        return 52; //To change body of generated methods, choose Tools | Templates.
    }
    
    public int validaEnCalseNormalPeroConPortamientoDeInterface1() {
        IValidando3 iValidando1 = new ClaseValidadoraDeInterfaces();
        return iValidando1.valida1();
    }
    
    public int validaEnCalseNormalPeroConPortamientoDeInterface2() {
        IValidando3 iValidando2 = new ClaseValidadoraDeInterfaces();
        return iValidando2.valida2();
    }
    
    
    @Override
    public void enValidacionUno() {
        System.out.println("Se utiliza metodo de interface IValidando1");
    }
    
}
