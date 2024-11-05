/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication33;

/**
 *
 * @author compr
 */
public class Reserva {
    private int idEmpleado;
    private String tipoActividad;
    private String horario;

    public Reserva(int idEmpleado, String tipoActividad, String horario) {
        this.idEmpleado = idEmpleado;
        this.tipoActividad = tipoActividad;
        this.horario = horario;
    }

    public String getHorario() {
        return horario;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public String getTipoActividad() {
        return tipoActividad;
    }
    
    
    
}
