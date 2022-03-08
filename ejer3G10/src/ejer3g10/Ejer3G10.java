/*
 Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de
 Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o
 televisores, con valores ya asignados.
 Luego, recorrer este array y ejecutar el método precioFinal() en cada
 electrodoméstico. Se deberá también mostrar el precio de cada tipo de objeto,
 es decir, el precio de todos los televisores y el de las lavadoras. Una vez hecho
 eso, también deberemos mostrar, la suma del precio de todos los
 Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 2000
 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
 electrodomésticos, 2000 para lavadora y 5000 para televisor
 */
package ejer3g10;

import java.util.ArrayList;

/**
 *
 * @author Rapp
 */
public class Ejer3G10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int conT, conL;
        ArrayList<Electrodomestico> electrodomestico = new ArrayList();
        Televisor televisor1 = new Televisor(45, true, 1000, "negro", 'A', 30);
        electrodomestico.add(televisor1);
        Televisor televisor2 = new Televisor(55, false, 1000, "blanco", 'A', 30);
        electrodomestico.add(televisor2);
        Lavadora lavadora1 = new Lavadora(34, 1000, "gris", 'A', 65);
        electrodomestico.add(lavadora1);
        Lavadora lavadora2 = new Lavadora(50, 1000, "negro", 'B', 70);
        electrodomestico.add(lavadora2);
        conT = 0;
        conL = 0;
        for (Electrodomestico elemento : electrodomestico) {
            if (elemento instanceof Lavadora) {
                conL += elemento.precio;
            } else {
                conT += elemento.precio;
            }
        }
        System.out.println("El total en televisores: " + conT);
        System.out.println("El total en lavadoras: " + conL);

        int acu = 0;
        for (Electrodomestico electrodomestico1 : electrodomestico) {
            acu += electrodomestico1.precio;
        }
        System.out.println("El precio de todos los electrodomesticos es: " + acu);

    }

}
