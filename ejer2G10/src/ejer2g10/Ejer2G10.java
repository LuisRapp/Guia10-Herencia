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
public class Ejer2G10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Lavadora lavadora= new Lavadora();
        System.out.println("Lavadora");
        lavadora.crearLavadora();
        System.out.println(lavadora);
        
        Televisor televisor=new Televisor();
        System.out.println("Televisor");
        televisor.crearTelevisor();
        System.out.println(televisor);
       
        
    }
    
}
