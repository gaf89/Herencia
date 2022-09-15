/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import entidades.Gato;
import entidades.Perro;

/**
 *
 * @author norae
 */
public class animales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Gato g = new Gato("NARANJOSO", 4, true, 5, 1000d);
        Perro p = new Perro("BEAGLE", 4, true, 12, 1000d);
        
        g.calcularEdad();
        g.hacerRuido();
        g.ronronear();
        
        System.out.println("-------------------------------");
        
        p.calcularEdad();
        p.hacerRuido();
        p.jugarEnParque(4);
        
        
    }
    
}
