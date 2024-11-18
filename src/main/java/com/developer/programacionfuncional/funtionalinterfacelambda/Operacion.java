package com.developer.programacionfuncional.funtionalinterfacelambda;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author santiago betancur
 *
 * SAM (Single Abstract Method) indica que tenemos una interfaz con un solo
 * método sin definir, con esto SAM nos permite crear nuestras propias
 * interfaces.
 */
@FunctionalInterface
public interface Operacion {

    double calcular(double n1, double n2);

}
