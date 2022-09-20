
package entidad;

public final class Yate extends Barco {
    
    protected Integer CV;
    protected Integer camarotes;

    public Yate(String matricula, Double eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
    }

    public Integer getCV() {
        return CV;
    }

    public Integer getCamarotes() {
        return camarotes;
    }

    public void setCV(Integer CV) {
        this.CV = CV;
    }

    public void setCamarotes(Integer camarotes) {
        this.camarotes = camarotes;
    }
    
    
}
