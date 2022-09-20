
package entidad;

import interfaces.calculosFormas;

public final class Circulo implements calculosFormas {
    
    protected Double radio;
    
    public Circulo() {
    }

    public Circulo(Double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }


    @Override
    public double calcularArea() {
        double area;
        area = PI * Math.pow(radio, 2);        
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro;
        perimetro = PI * radio * 2;
        return perimetro;
    }
 

}
