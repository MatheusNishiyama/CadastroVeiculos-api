package com.cadastroveiculos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cadastroveiculos.Vehicles;
import com.cadastroveiculos.repository.Cliente_Repository;


@RestController
@RequestMapping("/veiculos")
public class ClienteController {


	@Autowired
	private Cliente_Repository clienteRepository;

	@GetMapping
	public List<Vehicles> listar() {
		return clienteRepository.findAll();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Vehicles adicionar(@RequestBody Vehicles cliente) {
		return clienteRepository.save(cliente);
	}

	@DeleteMapping
	public void deletar(@RequestBody Vehicles cliente) {
		clienteRepository.delete(cliente);
	}

	@PutMapping
	public Vehicles atualizar(@RequestBody Vehicles cliente) {
		return clienteRepository.save(cliente);
	}


}
