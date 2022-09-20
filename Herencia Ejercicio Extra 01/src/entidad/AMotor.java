
package entidad;

public final class AMotor extends Barco {
    
    protected Integer CV;

    public AMotor(String matricula, Double eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
    }

    public Integer getCV() {
        return CV;
    }

    public void setCV(Integer CV) {
        this.CV = CV;
    }
    
    
}
