/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer2g10;

/**
 *
 * @author Rapp
 */
public class Lavadora extends Electrodomestico{
    private Integer carga;

    public Lavadora() {
    }

    public Lavadora(Integer carga) {
        this.carga = carga;
    }

    public Lavadora(Integer carga, int precio, String color, char consumoEner, int peso) {
        super(precio, color, consumoEner, peso);
        this.carga = carga;
    }
    
     public void crearLavadora(){
         crearElectrodomestico();
         System.out.println("Ingrese la capacidad de carga de la Lavadora");
         this.carga=read.nextInt();
         precioFinal();
     }
    @Override
     public void precioFinal() {
        super.precioFinal();
        if (this.carga > 30) {
            this.precio += 500;
        }

    }

   @Override
    public String toString() {
        return "Lavadora{" + super.toString() + " carga= " + carga;
    }
     
     
     
}
