/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.entidades;

/**
 *
 * @author Gaston
 */
public abstract class Estructura {
    
    protected Double superficieCubierta;
    protected Double superficieTotal;
    
    public Estructura(Double superficieTotal) {
        this.superficieTotal = superficieTotal;
    }

    public Double getSuperficieCubierta() {
        return superficieCubierta;
    }

    public Double getSuperficieTotal() {
        return superficieTotal;
    }

    public void setSuperficieCubierta(Double superficieCubierta) {
        this.superficieCubierta = superficieCubierta;
    }

    public void setSuperficieTotal(Double superficieTotal) {
        this.superficieTotal = superficieTotal;
    }
    
    public abstract void calcularSuperficie(double ancho, double largo);
    
}
