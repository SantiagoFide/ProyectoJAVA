/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication33;

/**
 *
 * @author compr
 */
public class Bebidas {
    private String bebidaname;
    private boolean disponible;

    public Bebidas(String bebidaname, boolean disponible) {
        this.bebidaname = bebidaname;
        this.disponible = disponible;
    }

    public String getBebidaname() {
        return bebidaname;
    }

    public boolean isDisponible() {
        return disponible;
    }
    
    public void servirBebida(){
        if (disponible){
            System.out.println("Sirviendo"+bebidaname);
            
        }else {
            System.out.println("la bebida"+bebidaname+"nos disponible");
        }
    }
}
