package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Bus;
import com.example.demo.repository.BusRepository;

@Service
public class BusService implements IBusService {
	
	@Autowired
	private BusRepository busRepository;

	@Override
	public List<Bus> listarBuses() {
		return (List<Bus>) busRepository.findAll();
	}

	@Override
	public void guardar(Bus b) {
		busRepository.save(b);
	}

	@Override
	public Bus buscarBus(Integer id) {
		return busRepository.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Integer id) {
		busRepository.deleteById(id);
	}

}
