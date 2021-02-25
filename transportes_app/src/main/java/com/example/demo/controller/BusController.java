package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Bus;
import com.example.demo.model.Fabricante;
import com.example.demo.service.IBusService;
import com.example.demo.service.IFabricanteService;


@Controller
public class BusController {
	
	@Autowired
	private IBusService iBusService;
	
	@Autowired
	private IFabricanteService iFabricanteService;
	
	@GetMapping("/lista")
	public String listarBuses(Model model) {
		List<Bus> listadoBuses = iBusService.listarBuses();
		
		model.addAttribute("titulo","Lista De Buses");
		
		model.addAttribute("buses", listadoBuses);
		return "lista";
	}
	
	@GetMapping("/agregar")
	public String agregarBus(Model model) {
		Bus bus = new Bus();
		List<Fabricante> listaFabricantes = iFabricanteService.listaFabricantes();
		model.addAttribute("titulo","Agregar Nuevo Bus");
		model.addAttribute("bus", bus);
		model.addAttribute("fabricantes", listaFabricantes);

		return "agregar";
	}
	
	@PostMapping("/guardar")
	public String guardar(@ModelAttribute Bus bus) {
		
		iBusService.guardar(bus);
		return "redirect:lista";
	}
	
	@GetMapping("/editar/{id_bus}")
	public String editarBus(@PathVariable("id_bus") Integer idBus, Model model) {
		
		Bus bus = iBusService.buscarBus(idBus);
		List<Fabricante> listaFabricantes = iFabricanteService.listaFabricantes();
		model.addAttribute("titulo","Editar Bus");
		model.addAttribute("bus", bus);
		model.addAttribute("fabricantes", listaFabricantes);

		return "agregar";
	}
	
	@GetMapping("/eliminar/{id_bus}")
	public String eliminarBus(@PathVariable("id_bus") Integer idBus) {
		
		iBusService.eliminar(idBus);

		return "redirect:/lista";
	}
	
	@GetMapping("/regresar")
	public String regresar() {
		
		return "redirect:/lista";
	}
}
