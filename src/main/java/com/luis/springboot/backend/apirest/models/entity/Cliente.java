package com.luis.springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Nationalized;
import org.hibernate.validator.constraints.UniqueElements;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="clientes")
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message = "No puede estar vacio")
	@Size(min = 4, max = 25, message = "Tiene que estar entre 4 y 25 caracteres")
	@Column(nullable = false)
	private String nombre;
	
	@NotEmpty(message = "No puede estar vacio")
	private String apellido;
	
	@NotEmpty(message = "No puede estar vacio")
	@Email(message = "Formato incorrecto")
	@Column(nullable = false, unique = false)
	private String email;
	
	@NotNull(message = "No puede estar vacio")
	@Temporal(TemporalType.DATE)
	private Date createAt;
	
	private String foto;
	
	@NotNull(message = "No puede estar vacio")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "region_id")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) // <-- Para evitar traer esas propiedades de JPA y marque error, debidp a que se usa Lazy  
	private Region region;
	
//	@PrePersist
//	public void prePersist() throws ParseException {
//		createAt = new Date(); 
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	
}
