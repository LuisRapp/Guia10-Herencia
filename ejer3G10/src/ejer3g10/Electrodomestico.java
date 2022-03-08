/*
 Crear una superclase llamada Electrodoméstico con los siguientes atributos:
 precio, color, consumo energético (letras entre A y F) y peso.
 Los constructores que se deben implementar son los siguientes:
 • Un constructor vacío.
 • Un constructor con todos los atributos pasados por parámetro.
 Los métodos a implementar son:
 • Métodos getters y setters de todos los atributos.
 • Método comprobarConsumoEnergetico(char letra): comprueba que la letra
 es correcta, sino es correcta usara la letra F por defecto. Este método se debe
 invocar al crear el objeto y no será visible.
 10
 • Método comprobarColor(String color): comprueba que el color es correcto, y
 si no lo es, usa el color blanco por defecto. Los colores disponibles para los
 electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
 está en mayúsculas o en minúsculas. Este método se invocará al crear el
 objeto y no será visible.
 • Metodo crearElectrodomestico(): le pide la información al usuario y llena el
 electrodoméstico, también llama los métodos para comprobar el color y el
 consumo. Al precio se le da un valor base de $1000.
 • Método precioFinal(): según el consumo energético y su tamaño, aumentará
 el valor del precio. Esta es la lista de precios
 */
package ejer3g10;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Rapp
 */
public class Electrodomestico {

    Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    protected int precio;
    protected String color;
    protected char consumoEner;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(int precio, String color, char consumoEner, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEner = consumoEner;
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEner() {
        return consumoEner;
    }

    public void setConsumoEner(char consumoEner) {
        this.consumoEner = consumoEner;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }


    
      public void crearElectrodomestico() {
        this.precio = 1000;
        System.out.println("Ingrese el color del electrodomestico");
        this.color = read.next();
        comprobarColor(this.color);
        System.out.println("Ingrese el consumo energetico ");
        this.consumoEner = read.next().charAt(0);
        comprobarConsumoEnergetico(this.consumoEner);
        System.out.println("Ingrese el peso del electrodomestico");
        this.peso = read.nextInt();
       
    }
    
    
  public void comprobarColor(String color) {
        if (!color.equalsIgnoreCase("blanco") && !color.equalsIgnoreCase("negro") && !color.equalsIgnoreCase("rojo") && !color.equalsIgnoreCase("azul") && !color.equalsIgnoreCase("gris")) {
            this.color = "blanco";
        }
    }
  
   
    public void comprobarConsumoEnergetico(char letra) {
        letra = Character.toUpperCase(letra);
        
        if (letra < 65 || letra > 70) {
            this.consumoEner = 'F';
        }else{
            this.consumoEner=Character.toUpperCase(letra);
        }
    }



    public void precioFinal() {
        switch (this.consumoEner) {
            case 'A':
                this.precio += 1000;
                break;
            case 'B':
                this.precio += 800;
                break;
            case 'C':
                this.precio += 600;
                break;
            case 'D':
                this.precio += 500;
                break;
            case 'E':
                this.precio += 300;
                break;
            case 'F':
                this.precio += 100;
                break;

        }
        if (this.precio>=1 && this.peso<=19) {
            this.precio+=100;
        }else if(this.precio>20 && this.peso<=49){
            this.precio+=500;
        }else if(this.precio>50 && this.peso<=79){
            this.precio+=800;
        }else{
            this.precio+=1000;
        }

    }

    @Override
    public String toString() {
        return " precio= " + precio + " color= " + color + " consumo= " + consumoEner + " peso= " + peso;
    }
   }
