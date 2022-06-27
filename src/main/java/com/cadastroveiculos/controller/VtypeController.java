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

import com.cadastroveiculos.Vehicle_type;
import com.cadastroveiculos.repository.VehicleTyoe_Repository;

@RestController
@RequestMapping("/tipoveiculos")
public class VtypeController {

	@Autowired
	private VehicleTyoe_Repository vtypeRepository;

	@GetMapping
	public List<Vehicle_type> listartipo() {
		return vtypeRepository.findAll();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Vehicle_type adiciona(@RequestBody Vehicle_type vtype) {
		return vtypeRepository.save(vtype);
	}

	@DeleteMapping
	public void deleta(@RequestBody Vehicle_type vtype) {
		vtypeRepository.delete(vtype);
	}

	@PutMapping
	public Vehicle_type atualiza(@RequestBody Vehicle_type vtype) {
		return vtypeRepository.save(vtype);
	}
}
