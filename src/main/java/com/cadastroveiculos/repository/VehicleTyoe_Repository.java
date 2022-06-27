package com.cadastroveiculos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cadastroveiculos.Vehicle_type;

@Repository
public interface VehicleTyoe_Repository extends JpaRepository<Vehicle_type, Long> {

}
