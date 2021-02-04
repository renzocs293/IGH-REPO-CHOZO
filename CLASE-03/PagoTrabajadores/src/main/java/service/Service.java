/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dto.Dto;

/**
 *
 * @author RYZEN
 */
public class Service {
    public Dto procesar(Dto dto){
		// Variables
		double salario, asignacion, bono,ingresos,impuestoalarenta,
                        salarioneto;
		// Proceso
		salario = dto.getHorastrabajadas() * dto.getPagoxhora();
		asignacion = 60*dto.getCantidadhijos();
		bono = (dto.getHorastrabajadas()-160)* dto.getPagoxhora()*2;
                ingresos=salario+asignacion+bono;
                impuestoalarenta=0;
                if(ingresos>1500){
                    impuestoalarenta=ingresos*0.08;     
                }
                salarioneto=ingresos-impuestoalarenta;
		// Retorno
		dto.setSalario(salario);
		dto.setAsignacion(asignacion);
		dto.setBono(bono);
                dto.setIngresos(ingresos);
                dto.setImpuestoalarenta(impuestoalarenta);
                dto.setSalarioneto(salarioneto);
		return dto;
	}
}
