package com.nestor.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.nestor.dao.MascotaRepository;
import com.nestor.entity.Mascota;

@Service
public class MascotaServiceImpl implements MascotaService {
	
	@Autowired
	private MascotaRepository mascotaRepo;

	@Override
    public Mascota mostrarMascotaPorId(Long id) {
        Optional<Mascota> mascota = mascotaRepo.findById(id);
        return mascota.orElse(null); // Devuelve null si no se encuentra la mascota
    }
	
	@Override
	public Mascota guardarMascota(Mascota mascota) {
		return mascotaRepo.save(mascota);
	}

	@Override
    public List<Mascota> listarMascotas() {
        return mascotaRepo.findAll();
    }

	@Override
    public List<Mascota> listarMascotasMasJovenes() {
        return mascotaRepo.findByOrderByFechaNacDesc();
    }

    @Override
    public List<Mascota> listarMascotasPag5() {
        PageRequest pageRequest = PageRequest.of(0, 5);
        return mascotaRepo.findAll(pageRequest).getContent();
    }

    @Override
    public List<Mascota> mostrarMascotaPorNombre(String nombre) {
        return mascotaRepo.findByNombre(nombre);
    }

    @Override
    public void eliminarMascota(Long id) {
        mascotaRepo.deleteById(id);
    }
}
