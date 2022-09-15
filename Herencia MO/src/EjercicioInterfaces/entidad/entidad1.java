/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioInterfaces.entidad;

import EjercicioInterfaces.interfaces.Interfaz1;

/**
 *
 * @author Gaston
 */
public class entidad1 implements Interfaz1 {

    @Override
    public void metodo() {
        System.out.println("Implementación de método");
    }

    @Override
    public int suma() {
        int suma = 2+2;
        return suma;
    }
    
    
}
