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
public final class CasaCampo extends Estructura {
    
    private boolean casaArbol;

    public CasaCampo(boolean casaArbol, Double superficieTotal) {
        super(superficieTotal);
        this.casaArbol = casaArbol;
    }

    public boolean isCasaArbol() {
        return casaArbol;
    }

    public Double getSuperficieCubierta() {
        return superficieCubierta;
    }

    public Double getSuperficieTotal() {
        return superficieTotal;
    }

    public void setCasaArbol(boolean casaArbol) {
        this.casaArbol = casaArbol;
    }

    public void setSuperficieCubierta(Double superficieCubierta) {
        this.superficieCubierta = superficieCubierta;
    }

    public void setSuperficieTotal(Double superficieTotal) {
        this.superficieTotal = superficieTotal;
    }

    
    
    @Override
    public void calcularSuperficie(double ancho, double largo) {
        this.superficieCubierta = ancho * largo;
    }
    
    
}
