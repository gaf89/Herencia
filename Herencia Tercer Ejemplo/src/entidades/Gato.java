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
public final class Gato extends Animal {
    
    protected String razaGatuna;

    public Gato() {
    }
 
    public Gato(String razaGatuna, Integer patas, boolean cola, Integer anosDeVida, Double energia) {
        super(patas, cola, anosDeVida, energia);
        this.razaGatuna = razaGatuna;
    }

    public String getRazaGatuna() {
        return razaGatuna;
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

    public void setRazaGatuna(String razaGatuna) {
        this.razaGatuna = razaGatuna;
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

    public void ronronear() {
        System.out.println("Prrrrrr...");
    }


    @Override
    public void calcularEdad() {
        System.out.println("La edad gatuna para "+this.anosDeVida+" es "+(anosDeVida * 8));
    }

    @Override
    public void hacerRuido() {
        super.hacerRuido();
        System.out.println("Miaaaauuuuu");
    }



}
