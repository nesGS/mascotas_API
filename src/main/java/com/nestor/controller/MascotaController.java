package com.nestor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nestor.entity.Mascota;
import com.nestor.service.MascotaService;

@RestController
@RequestMapping(path="/api", produces="application/json")
@CrossOrigin(origins="*")
public class MascotaController {

	@Autowired
	private MascotaService mascotaService;
	
	
	
	@GetMapping("/mascota")
	public List<Mascota> index() {
		return mascotaService.listarMascotas();
	}
	
	@GetMapping("/mascota/{id}")
	public Mascota showById(@PathVariable Long id) {
		return mascotaService.mostrarMascotaPorId(id);
	}
	
	@PostMapping("/mascota")
	public Mascota create(@RequestBody Mascota mascota) {
		return mascotaService.guardarMascota(mascota);		
	}
	
	@GetMapping("/mascota/byyouth")
	public List<Mascota> showByYouth() {
		return mascotaService.listarMascotasMasJovenes();
	}
	
	@GetMapping("/mascota/page")
	public List<Mascota> showMascotaPaged() {
		return mascotaService.listarMascotasPag5();		
	}
	
	@GetMapping("/mascota/nombre/{name}")
	public List<Mascota> showByName(@PathVariable String name) {
		return mascotaService.mostrarMascotaPorNombre(name);
	}
	
	@DeleteMapping("/mascota/{id}")
	public void delete(@PathVariable Long id) {
		mascotaService.eliminarMascota(id);
	}
}
