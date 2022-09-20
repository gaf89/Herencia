
package principal;

import entidad.Circulo;
import entidad.Rectangulo;

public class Ejercicio04 {
    
    public static void main(String[] args) {
        
        Circulo c1 = new Circulo(5.79);
        Rectangulo r1 = new Rectangulo(13.4, 8.56);
        
        System.out.println("El Area del circulo es "+c1.calcularArea());
        System.out.println("El Perimetro del circulo es "+c1.calcularPerimetro());
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("El Area del rectángulo es "+r1.calcularArea());
        System.out.println("El Perimetro del rectángulo es "+r1.calcularPerimetro());
    }
    
}
