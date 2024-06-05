package com.nestor.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.nestor.entity.Mascota;

public interface MascotaService {
	
	public Mascota mostrarMascotaPorId(Long id);
	
	public Mascota guardarMascota(Mascota mascota);
	
	public Iterable<Mascota> listarMascotas();
	
	public List<Mascota> listarMascotasMasJovenes();
	
		
	public List<Mascota> mostrarMascotaPorNombre(String name);
	
	public void eliminarMascota(Long id);
	
	public Page<Mascota> listarMascotasPaginadas(int pag, int qtty);

}
