package com.nestor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;

import com.nestor.entity.Mascota;
import com.nestor.service.MascotaService;

@RestController
@RequestMapping(path="/api", produces="application/json")
@CrossOrigin(origins="*")
public class MascotaController {

	// Se inyecta el servicio
	@Autowired
	private MascotaService mascotaService;
	
	
	// Metodo para mostrar la lista de todas las mascotas	
	@GetMapping("/mascota")
	public Iterable<Mascota> index() {
		return mascotaService.listarMascotas();
	}
	
	// Método para mostar una mascota a través de su ID
	@GetMapping("/mascota/{id}")
	public Mascota showById(@PathVariable Long id) {
		return mascotaService.mostrarMascotaPorId(id);
	}
	
	// Método para crear y guardar una mascota nueva
	@PostMapping(path="/mascota", consumes="application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public Mascota create(@RequestBody Mascota mascota) {
		return mascotaService.guardarMascota(mascota);		
	}
		
	// Método para mostrar una lista de las 20 mascotas más jovenes
	@GetMapping("/mascota/byyouth")
	public List<Mascota> showByYouth() {
		return mascotaService.listarMascotasMasJovenes();
	}
	
	// Método para mostrar una mascota a través de su nombre
	@GetMapping("/mascota/nombre/{name}")
	public List<Mascota> showByName(@PathVariable String name) {
		return mascotaService.mostrarMascotaPorNombre(name);
	}
	
	// Método para borrar una mascota introduciendo su ID
	@DeleteMapping("/mascota/{id}")
	public void delete(@PathVariable Long id) {
		mascotaService.eliminarMascota(id);
	}
		
	// Método para mostrar todas las mascotas guardadas, pero en páginas de 5
	@GetMapping("/mascota/paginadas/{pag}")
    public Page<Mascota> obtenerMascotasPaginadas(
            @PathVariable("pag") int pag,
            @RequestParam(name = "qtty", defaultValue = "5" ) int qtty) {
        return mascotaService.listarMascotasPaginadas(pag, qtty);
    }
	
	
}
