/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Gaston
 */
public final class Televisor extends Electrodomestico {
    
    protected Integer resolucion;
    protected Boolean sintonizador;

    public Televisor() {
    }

    public Televisor(Integer resolucion, Boolean sintonizador, Double precio, String color, Character consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public Boolean getSintonizador() {
        return sintonizador;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public void setSintonizador(Boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    @Override
    public String toString() {
        return "Precio: "+precio+"   Color: "+color+"   Consumo: "+consumo+"   Peso: "+peso+"   Resolucion: " + resolucion + "   Sintonizador: " + sintonizador;
    }
    
    
    
    /*
    Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
    */
    
    public void crearTelevisor() {
        System.out.println("****Televisor****");
        crearElectrodomestico();
        System.out.print("Resoluciòn(pulgadas): ");
        this.resolucion = leer.nextInt();
        System.out.println("Sintonizador TDT (si/no): ");
        String resp = leer.next();
        this.sintonizador = "si".equalsIgnoreCase(resp);
    }
    
    /*
    Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
    */
    
    @Override
    public void precioFinal(){
        super.precioFinal();
        if (resolucion > 40) {
            this.precio += precio * 0.3;
        }
        if (sintonizador) {
            this.precio += 500d;
        }
    }
    
}
