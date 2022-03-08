/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
resolución (en pulgadas) y sintonizador TDT (booleano),
 */
package ejer3g10;

/**
 *
 * @author Rapp
 */
public class Televisor extends Electrodomestico{
    private double resolucion;
    private boolean tdt;

    public Televisor() {
    }

    public Televisor(double resolucion, boolean tdt, int precio, String color, char consumoEner, int peso) {
        super(precio, color, consumoEner, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }
   public void crearTelevisor() {
        crearElectrodomestico();
        System.out.println("Ingrese resolucion del televisor");
        this.resolucion = read.nextInt();
        System.out.println("Ingrese true o false para saber si tiene sintonizador TDT");
        this.tdt = read.nextBoolean();
        precioFinal();

    } 
   @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.resolucion>40) {
            this.precio=(int) (this.precio*1.3);
        }
        if (tdt) {
            this.precio+=500;
        }
    }
    
}
