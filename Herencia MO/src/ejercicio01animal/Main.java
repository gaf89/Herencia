/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01animal;

import ejercicio01animal.entidad.Animal;
import ejercicio01animal.entidad.Gato;
import ejercicio01animal.entidad.Perro;
import java.util.ArrayList;

/**
 *
 * @author Gaston
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Animal> animales = new ArrayList();
        
        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();

        animales.add(a);
        animales.add(b);
        animales.add(c);
        
        for (Animal aux : animales) {
            aux.hacerRuido();
        }
    }
    
}
