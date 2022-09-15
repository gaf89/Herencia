/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Gaston
 */
public abstract class Animal {
    
    protected Integer patas;
    protected boolean cola;
    protected Integer anosDeVida;
    protected Double energia;

    public Animal() {
    }

    public Animal(Integer patas, boolean cola, Integer anosDeVida, Double energia) {
        this.patas = patas;
        this.cola = cola;
        this.anosDeVida = anosDeVida;
        this.energia = energia;
    }
    
    public abstract void calcularEdad();

    public void hacerRuido() {
        System.out.println("Respiracion animal");
    }
    
}
