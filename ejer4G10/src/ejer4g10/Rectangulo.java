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
public class Rectangulo implements calculosFormas {

    private double base;
    private double altura;
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {
        System.out.println("Ingrese la base del rectangulo: ");
        this.base = leer.nextDouble();
        System.out.println("Ingrese la altura del rectangulo: ");
        this.altura = leer.nextDouble();
        area();
        perimetro();
    }

    @Override
    public void area() {
        System.out.printf("El area del rectangulo es %.2f \n", this.altura * this.base);
    }

    @Override
    public void perimetro() {
        System.out.printf("El perimetro del rectangulo es: %.2f \n", (this.altura + this.base) * 2);
    }
}
