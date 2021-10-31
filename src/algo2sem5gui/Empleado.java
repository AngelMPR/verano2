/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editorjhrjyjy.
 */
package algo2sem5gui;


public class Empleado {
    private String nombre;
    private String apellido;
    private Job job;
    private int nroEquipo;

    public Empleado(String nombre, String apellido, Job job, int nroEquipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.job = job;
        this.nroEquipo = nroEquipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public int getNroEquipo() {
        return nroEquipo;
    }

    public void setNroEquipo(int nroEquipo) {
        this.nroEquipo = nroEquipo;
    }
    
    
}
