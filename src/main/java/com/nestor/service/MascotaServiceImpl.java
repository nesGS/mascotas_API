package com.nestor.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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
    public Iterable<Mascota> listarMascotas() {
        return mascotaRepo.findAll();
    }

	@Override
    public List<Mascota> listarMascotasMasJovenes() {
        return mascotaRepo.findTop20ByOrderByFechaNacDesc();
    }

    @Override
    public List<Mascota> mostrarMascotaPorNombre(String nombre) {
        return mascotaRepo.findByNombreIgnoreCase(nombre);
    }

    @Override
    public void eliminarMascota(Long id) {
        mascotaRepo.deleteById(id);
    }
	
    @Override
    public Page<Mascota> listarMascotasPaginadas(int pag, int qtty) {
        PageRequest pageRequest = PageRequest.of(pag, qtty, Sort.by("fechaNac").descending());
        return mascotaRepo.findAll(pageRequest);
    }

	
}
