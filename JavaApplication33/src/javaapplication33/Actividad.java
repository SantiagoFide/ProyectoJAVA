/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication33;

/**
 *
 * @author compr
 */
public class Actividad {
    private String nameActi;
    private String horario;
    private int capacidad;
    private int EspaciosOcupados;
    public String yoga;

    public Actividad(String nameActi, String horario, int capacidad, int EspaciosOcupados) {
        this.nameActi = nameActi;
        this.horario = horario;
        this.capacidad = capacidad;
        this.EspaciosOcupados = EspaciosOcupados;
    }

    public String getNameActi() {
        return nameActi;
    }
    public int getCapacidad(){
        return capacidad;
    }


    public String getHorario() {
        return horario;
    }
    public boolean siEspacio(){
        return EspaciosOcupados<capacidad;
        
    }
    public boolean reservarEspacio(){
        if(siEspacio()){
            EspaciosOcupados++;
            return true;
        }else {
            System.out.println("no hay espacio para la actividad"+nameActi+"a las "+horario);
            return false;
        }
    }
    public void cancelarReserva(){
        if (EspaciosOcupados>0){
            EspaciosOcupados--;
        }
    }
    
    
    
}
