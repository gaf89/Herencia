
package entidad;

import java.util.Scanner;

public abstract class Electrodomestico {
    
    Scanner leer = new Scanner(System.in);
    
    protected Double precio;
    protected String color;
    protected Character consumo;
    protected Double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, Character consumo, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public Character getConsumo() {
        return consumo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumo(Character consumo) {
        this.consumo = consumo;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    
    /*
    Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
    */
    
    public void comprobarCosumoEnergetico(char letra) {
        letra = Character.toUpperCase(letra);
        
        if ('A'==letra||'B'==letra||'C'==letra||'D'==letra||'E'==letra) {
            this.consumo = letra;
        } else {
            this.consumo = 'F';
        }
    }
    
    /*
    Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
    */
    
    public void comprobarColor(String color) {
        color = color.toLowerCase();
        switch (color){
            case "negro":
            case "rojo":
            case "azul":
            case "gris": this.color = color;
                         break;
            default: this.color = "blanco";
                     break;
        }
    }
    
    /*
    Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
    */
    
    public void crearElectrodomestico() {
        System.out.println("Ingresar datos del Electrodoméstico");
        System.out.print("Color: ");
        String col = leer.next();
        System.out.print("Consumo energético (A/B/C/D/E/F): ");
        char let = leer.next().charAt(0);
        System.out.println(let);
        System.out.print("Peso (Kg): ");
        this.peso = leer.nextDouble();        
        this.precio = 1000d;        
        comprobarCosumoEnergetico(let);
        comprobarColor(col);
    }
    
//    Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
//precio. Esta es la lista de precios:
    
    public void precioFinal() {
        switch (consumo) {
            case 'A': this.precio += 1000d;
                      break;
            case 'B': this.precio += 800d;
                      break;
            case 'C': this.precio += 600d;
                      break;
            case 'D': this.precio += 500d;
                      break;
            case 'E': this.precio += 300d;
                      break;
            case 'F': this.precio += 100d;
                      break;            
        }
        
        if (peso >= 1 && peso < 19) {
            this.precio += 100d;            
        } else {
            if (peso >= 20 && peso < 49) {
               this.precio += 500d;
            } else {
                if (peso >= 50 && peso < 79) {
                    this.precio += 800d;
                } else {
                    if (peso >= 80) {
                        this.precio += 1000d;
                    }
                }
            }        
        }
        
    }
    
}
