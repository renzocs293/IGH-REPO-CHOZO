/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto02.service;

import org.apache.log4j.PropertyConfigurator;
import proyecto02.dto.PlanoDto;
import proyecto02.log.Log4jTest;

/**
 *
 * @author RENZO
 */
public class PlanoService {
    
    /*PropertyConfigurator.configure("log4j.properties");
    org.apache.log4j.BasicConfigurator.configure();*/
    public PlanoDto calcularDistancia(PlanoDto dto){
       
       
        // Variables
	double distancia;

	// Proceso
	distancia = Math.sqrt(Math.pow(dto.getEjeX2() - dto.getEjeX1(),2) + Math.pow(dto.getEjeY2() - dto.getEjeY1(),2));
            
	// Retorno
	dto.setDistancia(distancia);
	return dto;
    }
    
    public PlanoDto calcularCuadranteP1(PlanoDto dto){
        int cuadrante1 = 0;
                if(dto.getEjeX1() > 0 && dto.getEjeY1() > 0){
            cuadrante1 = 1;
        }else if(dto.getEjeX1() < 0 && dto.getEjeY1() > 0){
            cuadrante1 = 2;
        }else if (dto.getEjeX1() < 0 && dto.getEjeY1() < 0){
            cuadrante1 = 3;
        }else if(dto.getEjeX1() > 0 && dto.getEjeY1() < 0){
            cuadrante1 = 4;
        }
        dto.setCuadrante1(cuadrante1);
        return dto;
    }
    
    public PlanoDto calcularCuadranteP2(PlanoDto dto){
        int cuadrante2 = 0;

        cuadrante2 = 0;
        if(dto.getEjeX2() > 0 && dto.getEjeY2() > 0){
            cuadrante2 = 1;
        }else if(dto.getEjeX2() < 0 && dto.getEjeY2() > 0){
            cuadrante2 = 2;
        }else if (dto.getEjeX2() < 0 && dto.getEjeY2() < 0){
            cuadrante2 = 3;
        }else if(dto.getEjeX2() > 0 && dto.getEjeY2() < 0){
            cuadrante2 = 4;
        }
        dto.setCuadrante2(cuadrante2);
        return dto;
    }
}
