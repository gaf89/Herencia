/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01animal.entidad;

/**
 *
 * @author Gaston
 */
public class Perro extends Animal {

    public Perro(String nombre) {
        super(nombre);
    }

    public Perro() {
    }

    @Override
    public void hacerRuido() {
        System.out.println("Guau");
    }
    
    
    
}
