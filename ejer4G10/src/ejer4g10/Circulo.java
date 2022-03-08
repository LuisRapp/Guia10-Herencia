/*
 Se plantea desarrollar un programa que nos permita calcular el área y el perímetro
 de formas geométricas, en este caso un circulo y un rectángulo. Ya que este
 calculo se va a repetir en las dos formas geométricas, vamos a crear una Interfaz,
 llamada calculosFormas que tendrá, los dos métodos para calcular el área, el
 perímetro y el valor de PI como constante.
 Desarrollar el ejercicio para que las formas implementen los métodos de la
 interfaz y se calcule el área y el perímetro de los dos. En el main se crearán las
 formas y se mostrará el resultado final.
 Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
 Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2
 */
package ejer4g10;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Rapp
 */
public class Circulo implements calculosFormas {

    private double radio;
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public void crearCirculo() {
        System.out.println("Ingrese el radio del circulo: ");
        this.radio = leer.nextDouble();
        area();
        perimetro();
    }

    @Override
    public void area() {
        System.out.printf("El area del circulo es %.2f \n", PI * Math.pow(radio, 2));

    }

    @Override
    public void perimetro() {
        System.out.printf("El perimetro del circulo es: %.2f \n", (2 * PI * this.radio));
    }

}
