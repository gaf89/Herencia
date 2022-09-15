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
public class Perro extends Animal {

    protected String razaPerruna;

    public Perro(String razaPerruna) {
        this.razaPerruna = razaPerruna;
    }

    public Perro(String razaPerruna, Integer patas, boolean cola, Integer anosDeVida, Double energia) {
        super(patas, cola, anosDeVida, energia);
        this.razaPerruna = razaPerruna;
    }

    public Perro() {
    }

    public String getRazaPerruna() {
        return razaPerruna;
    }

    public Integer getPatas() {
        return patas;
    }

    public boolean isCola() {
        return cola;
    }

    public Integer getAnosDeVida() {
        return anosDeVida;
    }

    public Double getEnergia() {
        return energia;
    }

    public void setRazaPerruna(String razaPerruna) {
        this.razaPerruna = razaPerruna;
    }

    public void setPatas(Integer patas) {
        this.patas = patas;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setAnosDeVida(Integer anosDeVida) {
        this.anosDeVida = anosDeVida;
    }

    public void setEnergia(Double energia) {
        this.energia = energia;
    }
    
    public void jugarEnParque(int tiempo) {
        for (int i = 0; i < tiempo; i++) {
            energia -= 10;
        }
        System.out.println("La cantidad de enregia restante es "+this.energia);
    }

    @Override
    public void calcularEdad() {
        System.out.println("La edad perruna es para "+this.anosDeVida+" es "+(anosDeVida * 7));
    }

    @Override
    public void hacerRuido() {
        super.hacerRuido();
        System.out.println("Guau");
    }
    
    

    
  
    
}
