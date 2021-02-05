/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto02.prueba;

import proyecto02.dto.PlanoDto;
import proyecto02.service.PlanoService;

/**
 *
 * @author RENZO
 */
public class Prueba01 {
    
    public static void main(String[] args) {
        // Datos
        PlanoDto dto = new PlanoDto(3,3,-6,-5);
        
        // Proceso
        PlanoService service = new PlanoService();
        dto = service.calcularDistancia(dto);
        dto = service.calcularCuadranteP1(dto);
        dto = service.calcularCuadranteP2(dto);
        // Reporte
        System.out.println("Cuadrante X1,Y1: " + dto.getCuadrante1());
        System.out.println("Cuadrante X2,Y2: " + dto.getCuadrante2());
        System.out.println("Distancia: " + dto.getDistancia());
    }
}
