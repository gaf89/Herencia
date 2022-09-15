/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioInterfaces;

import EjercicioInterfaces.entidad.entidad1;

/**
 *
 * @author Gaston
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        entidad1 e = new entidad1();
        
        e.metodo();
        System.out.println(e.suma());
    }
    
}
