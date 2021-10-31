/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo2sem5gui;
import java.io.*;

/**
 *
 * @author PC
 */
public class Job implements Serializable{
    private double salario;
    private String nombreDeJob;

    public Job(double salario, String nombreDeJob) {
        this.salario = salario;
        this.nombreDeJob = nombreDeJob;
    }
    public boolean equals(Job job){
        return (this.salario==job.salario && 
                this.nombreDeJob.equals(job.nombreDeJob));
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNombreDeJob() {
        return nombreDeJob;
    }

    public void setNombreDeJob(String nombreDeJob) {
        this.nombreDeJob = nombreDeJob;
    }
    
    
}
