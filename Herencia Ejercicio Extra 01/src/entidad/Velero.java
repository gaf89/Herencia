
package entidad;

public final class Velero extends Barco {
    
    protected Integer mastiles;

    public Velero(String matricula, Double eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
    }

    public Integer getMastiles() {
        return mastiles;
    }

    public void setMastiles(Integer mastiles) {
        this.mastiles = mastiles;
    }
    
    
}
