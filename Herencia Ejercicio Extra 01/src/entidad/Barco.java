
package entidad;

import java.util.Date;

public abstract class Barco {

    protected String matricula;
    protected Double eslora;
    protected Integer anioFabricacion;

    public Barco(String matricula, Double eslora, Integer anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public Double getEslora() {
        return eslora;
    }

    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setEslora(Double eslora) {
        this.eslora = eslora;
    }

    public void setAnioFabricacion(Integer anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
    
    
}
