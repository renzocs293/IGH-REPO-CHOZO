package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Bus;

public interface IBusService {

	public List<Bus> listarBuses();
	public void guardar(Bus b);
	public Bus buscarBus(Integer id);
	public void eliminar(Integer id);
}
