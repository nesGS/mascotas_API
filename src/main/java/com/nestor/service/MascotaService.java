package com.nestor.service;

import java.util.List;

import com.nestor.entity.Mascota;

public interface MascotaService {
	
	public Mascota mostrarMascotaPorId(Long id);
	
	public Mascota guardarMascota(Mascota mascota);
	
	public List<Mascota> listarMascotas();
	
	public List<Mascota> listarMascotasMasJovenes();
	
	public List<Mascota> listarMascotasPag5();
		
	public List<Mascota> mostrarMascotaPorNombre(String name);
	
	public void eliminarMascota(Long id);

}
