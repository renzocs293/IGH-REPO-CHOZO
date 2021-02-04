/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import dto.Dto;
import service.Service;

/**
 *
 * @author RYZEN
 */
public class Prueba {
    public static void main(String[] args) {
		// Datos
		Dto dto = new Dto(180,60,2);
		// Proceso
		Service service = new Service();
		dto = service.procesar(dto);
		// Reporte
		System.out.println("Salario: " + dto.getSalario());
		System.out.println("Asignacion: " + dto.getAsignacion());
		System.out.println("Bono: " + dto.getBono());
                System.out.println("Ingresos: " + dto.getIngresos());
		System.out.println("Impuesto a la renta: " + dto.getImpuestoalarenta());
		System.out.println("Salario Neto: " + dto.getSalarioneto());
	}
}
