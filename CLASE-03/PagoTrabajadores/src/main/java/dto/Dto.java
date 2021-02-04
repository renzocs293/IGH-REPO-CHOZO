package dto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RYZEN
 */
public class Dto {
    // Datos entrada

    private int horastrabajadas;
    private double pagoxhora;
    private int cantidadhijos;
    // Datos salida
    private double salario;
    private double asignacion;
    private double bono;
    private double ingresos;
    private double impuestoalarenta;
    private double salarioneto;

    public Dto() {
    }

    public Dto(int horastrabajadas, double pagoxhora, int cantidadhijos) {
        this.horastrabajadas = horastrabajadas;
        this.pagoxhora = pagoxhora;
        this.cantidadhijos = cantidadhijos;
    }

    public int getHorastrabajadas() {
        return horastrabajadas;
    }

    public void setHorastrabajadas(int horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }

    public double getPagoxhora() {
        return pagoxhora;
    }

    public void setPagoxhora(double pagoxhora) {
        this.pagoxhora = pagoxhora;
    }

    public int getCantidadhijos() {
        return cantidadhijos;
    }

    public void setCantidadhijos(int cantidadhijos) {
        this.cantidadhijos = cantidadhijos;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getAsignacion() {
        return asignacion;
    }

    public void setAsignacion(double asignacion) {
        this.asignacion = asignacion;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public double getImpuestoalarenta() {
        return impuestoalarenta;
    }

    public void setImpuestoalarenta(double impuestoalarenta) {
        this.impuestoalarenta = impuestoalarenta;
    }

    public double getSalarioneto() {
        return salarioneto;
    }

    public void setSalarioneto(double salarioneto) {
        this.salarioneto = salarioneto;
    }

}
