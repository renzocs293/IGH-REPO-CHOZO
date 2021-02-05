/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.Arrays;

/**
 *
 * @author RENZO
 */
public class PromedioService {
    
    public double calcPromedioPracticas(double practica1,double practica2,double practica3,double practica4){
        double promPractica = 0;
        double[] calcNotas;
        calcNotas = new double[]{practica1,practica2,practica3,practica4};
        Arrays.sort(calcNotas);
        for (int i = 1; i < calcNotas.length; i++) {
            promPractica = promPractica + calcNotas[i];
	}
        promPractica = promPractica/3;
        return promPractica;
    }
    
    public double calcPromPonderado(double exmParcial, double exmFinal, double promPractica){
        double promPonderado;
        promPonderado = exmParcial*0.25 + promPractica * 0.25 + exmFinal * 0.50;
        return  promPonderado;
    }
}
