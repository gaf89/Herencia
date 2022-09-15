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
public final class Gato extends Animal {
    
    protected String raza;

    public Gato() {
    }

    public Gato(String raza, String nombre) {
        super(nombre);
        this.raza = raza;
    }

    @Override
    public void hacerRuido() {
        System.out.println("Miau");
    }



}
