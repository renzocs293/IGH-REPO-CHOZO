/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto02.dto;

/**
 *
 * @author RENZO
 */
public class PlanoDto {
    //Entrada
    double ejeX1,ejeX2,ejeY1,ejeY2;
    
    //Salida
    int cuadrante1, cuadrante2;
    double distancia;
    
    public PlanoDto(){
        
    }

    public PlanoDto(double ejeX1, double ejeX2, double ejeY1, double ejeY2) {
        this.ejeX1 = ejeX1;
        this.ejeX2 = ejeX2;
        this.ejeY1 = ejeY1;
        this.ejeY2 = ejeY2;
    }

    public double getEjeX1() {
        return ejeX1;
    }

    public void setEjeX1(double ejeX1) {
        this.ejeX1 = ejeX1;
    }

    public double getEjeX2() {
        return ejeX2;
    }

    public void setEjeX2(double ejeX2) {
        this.ejeX2 = ejeX2;
    }

    public double getEjeY1() {
        return ejeY1;
    }

    public void setEjeY1(double ejeY1) {
        this.ejeY1 = ejeY1;
    }

    public double getEjeY2() {
        return ejeY2;
    }

    public void setEjeY2(double ejeY2) {
        this.ejeY2 = ejeY2;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public int getCuadrante1() {
        return cuadrante1;
    }

    public void setCuadrante1(int cuadrante1) {
        this.cuadrante1 = cuadrante1;
    }

    public int getCuadrante2() {
        return cuadrante2;
    }

    public void setCuadrante2(int cuadrante2) {
        this.cuadrante2 = cuadrante2;
    }
    
    
}
