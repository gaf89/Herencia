
package entidad;

public final class Lavadora extends Electrodomestico {
    
    protected Double carga;

    public Lavadora() {
    }
   
    public Lavadora(Double carga, Double precio, String color, Character consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Precio: "+precio+"   Color: "+color+"   Consumo: "+consumo+"   Peso: "+peso+"   Carga: "+carga;
    }

    
    /*
    Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.
    */
    
    public void crearLavadora() {
        System.out.println("****Lavadora****");
        crearElectrodomestico();
        System.out.print("Carga: ");
        this.carga = leer.nextDouble();
    }
    
    /*
    Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.
    */
    
    @Override
    public void precioFinal() {
        super.precioFinal();
        if (carga > 30) {
            this.precio += 500d;
        }
    }
    
}
