
package entidad;

import interfaces.calculosFormas;

public final class Rectangulo implements calculosFormas {
    
    protected Double base;
    protected Double altura;

    public Rectangulo() {
    }

    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
       double area;
       area = base * altura;
       return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro;
        perimetro = (base + altura) * 2;
        return perimetro;
    }

  
}
