/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del
Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá
mostrar luego un mensaje por pantalla informando de que se alimenta. Generar
una clase Main que realice lo siguiente
 */
package ejer1g10;

/**
 *
 * @author Rapp
 */
public class Ejer1G10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Animal perro=new Perro("Jose", "carne", 12, "doberman");     
        perro.alimentarse();
        Animal gato=new Gato("Michi", "atún", 5, "Persa");     
        gato.alimentarse();
        Animal caballo =new Caballo("Mestizo", "alfalfa", 3, "Persa");     
        caballo.alimentarse();
        
    }
    
}
