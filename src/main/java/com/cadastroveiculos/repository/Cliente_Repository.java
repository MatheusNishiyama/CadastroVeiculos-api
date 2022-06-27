package com.cadastroveiculos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cadastroveiculos.Vehicles;

@Repository
public interface Cliente_Repository extends JpaRepository<Vehicles, Long> {

}
