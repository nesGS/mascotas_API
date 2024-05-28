package com.nestor.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nestor.entity.Mascota;

@Repository
public interface MascotaRepository extends JpaRepository<Mascota, Long> {
	
	List<Mascota> findByOrderByFechaNacDesc();
    List<Mascota> findByNombre(String nombre);

	
}
