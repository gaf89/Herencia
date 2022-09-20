package principal;

import entidad.Electrodomestico;
import entidad.Lavadora;
import entidad.Televisor;
import java.util.ArrayList;

public class Ejercicio02 {

    public static void main(String[] args) {

        Lavadora l1 = new Lavadora();
        Televisor t1 = new Televisor();

        // Ejercicio 02

        l1.crearLavadora();
        System.out.println(l1.toString());
        l1.precioFinal();
        
        System.out.println("");
        
        t1.crearTelevisor();
        System.out.println(t1.toString());
        t1.precioFinal();
        
        System.out.println("");
        System.out.println(l1.toString());
        System.out.println(t1.toString());

        // Ejercicio 03
        
        System.out.println("");
        System.out.println("");
        
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();
        
        electrodomesticos.add(new Lavadora(15d, 1000d, "blaco", 'B', 60d));
        electrodomesticos.add(new Televisor(40, true, 1000d, "gris", 'A', 20d));
        electrodomesticos.add(new Lavadora(25d, 1000d, "azul", 'C', 65d));
        electrodomesticos.add(new Televisor(47, false, 1000d, "negro", 'A', 25d));
        
        double precioTotal = 0;
        
        for (Electrodomestico aux : electrodomesticos) {
            aux.precioFinal();
            System.out.println(aux.toString());
            precioTotal += aux.getPrecio();
        }
        
        System.out.println("");
        System.out.println("El precio total de todos los electrodomesticos es: "+precioTotal);

    }
    
}
