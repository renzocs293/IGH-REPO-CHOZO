/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import Service.PromedioService;

/**
 *
 * @author RENZO
 */
public class PromedioPrueba {
    public static void main(String[] args) {
        double promPonderado, promPractica;
        double practica01,practica02,practica03,practica04,exmParcial,exmFinal;
        practica01 = 20;
        practica02 = 10;
        practica03 = 11;
        practica04 = 13;
        exmParcial = 14;
        exmFinal = 12;
        PromedioService service = new PromedioService();
        promPractica = service.calcPromedioPracticas(practica01, practica02, practica03, practica04);
        promPonderado = service.calcPromPonderado(exmParcial, exmFinal, promPractica);
        
        System.out.println("Prom. Practicas : " + promPractica);
	System.out.println("Ponderado : " + promPonderado);
    }
}
