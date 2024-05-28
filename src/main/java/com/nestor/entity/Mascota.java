package com.nestor.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
public class Mascota implements Serializable {
	
	// En caso de establecer los atributos como final, lombok a traves de @Data, 
	// crearía un constructor con argumentos y no permite la correcta instanciacion de la clase por JPA
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false)
	private String nombre;
	@Temporal(TemporalType.DATE)
	private Date fechaNac;
	@Column(nullable = false)
	private String raza;
	@Column(nullable = false)
	private double peso;
	@Column(nullable = false)
	private boolean tieneChip;	
	private String urlFoto;
	
	private static final long serialVersionUID = 1L;
}
