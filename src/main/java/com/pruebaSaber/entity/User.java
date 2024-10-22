package com.pruebaSaber.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {
	
	@Id
	private String id;
	
	private String fullname;
	private long numDocumento;
	private String tipoDocumento;
	private long numTelefono;
	private String numRegister;
	private String email;
	private String password;
	private String PuntajeGlobal;
	private String puntajeNivelGlobal;
	private String comunicacionEscrita;
	private String comunicacionEscritaNivel;
	private String razonamientoCuantitativo;
	private String razonamientoCuantitativoNivel;
	private String lecturaCritica;
	private String lecturaCriticaNivel;
	private String competenciasCiudadanas;
	private String competenciasCiudadanasNivel;
	private String ingles;
	private String inglesNivel;
	private String proyectosIngenieria;
	private String proyectosIngenieriaNivel;
	private String pensamientoMatematico;
	private String pensamientoMatematicoNivel;
	private String disenhoSoftware;
	private String disenhoSoftwareNivel;
	private String nivelDeIngles;
	
	public User() {
		super();
	}


	    private boolean anulado;

	    public boolean isAnulado() {
	        return anulado;
	    }
	

	public User(String id, String fullname, long numDocumento, String tipoDocumento, long numTelefono,
			String numRegister, String email, String password, String puntajeGlobal, String puntajeNivelGlobal,
			String comunicacionEscrita, String comunicacionEscritaNivel, String razonamientoCuantitativo,
			String razonamientoCuantitativoNivel, String lecturaCritica, String lecturaCriticaNivel,
			String competenciasCiudadanas, String competenciasCiudadanasNivel, String ingles, String inglesNivel,
			String proyectosIngenieria, String proyectosIngenieriaNivel, String pensamientoMatematico,
			String pensamientoMatematicoNivel, String disenhoSoftware, String disenhoSoftwareNivel, String nivelDeIngles) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.numDocumento = numDocumento;
		this.tipoDocumento = tipoDocumento;
		this.numTelefono = numTelefono;
		this.numRegister = numRegister;
		this.email = email;
		this.password = password;
		PuntajeGlobal = puntajeGlobal;
		this.puntajeNivelGlobal = puntajeNivelGlobal;
		this.comunicacionEscrita = comunicacionEscrita;
		this.comunicacionEscritaNivel = comunicacionEscritaNivel;
		this.razonamientoCuantitativo = razonamientoCuantitativo;
		this.razonamientoCuantitativoNivel = razonamientoCuantitativoNivel;
		this.lecturaCritica = lecturaCritica;
		this.lecturaCriticaNivel = lecturaCriticaNivel;
		this.competenciasCiudadanas = competenciasCiudadanas;
		this.competenciasCiudadanasNivel = competenciasCiudadanasNivel;
		this.ingles = ingles;
		this.inglesNivel = inglesNivel;
		this.proyectosIngenieria = proyectosIngenieria;
		this.proyectosIngenieriaNivel = proyectosIngenieriaNivel;
		this.pensamientoMatematico = pensamientoMatematico;
		this.pensamientoMatematicoNivel = pensamientoMatematicoNivel;
		this.disenhoSoftware = disenhoSoftware;
		this.disenhoSoftwareNivel = disenhoSoftwareNivel;
		this.nivelDeIngles = nivelDeIngles;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public long getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(long numDocumento) {
		this.numDocumento = numDocumento;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public long getNumTelefono() {
		return numTelefono;
	}

	public void setNumTelefono(long numTelefono) {
		this.numTelefono = numTelefono;
	}

	public String getNumRegister() {
		return numRegister;
	}

	public void setNumRegister(String numRegister) {
		this.numRegister = numRegister;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPuntajeGlobal() {
		return PuntajeGlobal;
	}

	public void setPuntajeGlobal(String puntajeGlobal) {
		PuntajeGlobal = puntajeGlobal;
	}

	public String getPuntajeNivelGlobal() {
		return puntajeNivelGlobal;
	}

	public void setPuntajeNivelGlobal(String puntajeNivelGlobal) {
		this.puntajeNivelGlobal = puntajeNivelGlobal;
	}

	public String getComunicacionEscrita() {
		return comunicacionEscrita;
	}

	public void setComunicacionEscrita(String comunicacionEscrita) {
		this.comunicacionEscrita = comunicacionEscrita;
	}

	public String getComunicacionEscritaNivel() {
		return comunicacionEscritaNivel;
	}

	public void setComunicacionEscritaNivel(String comunicacionEscritaNivel) {
		this.comunicacionEscritaNivel = comunicacionEscritaNivel;
	}

	public String getRazonamientoCuantitativo() {
		return razonamientoCuantitativo;
	}

	public void setRazonamientoCuantitativo(String razonamientoCuantitativo) {
		this.razonamientoCuantitativo = razonamientoCuantitativo;
	}

	public String getRazonamientoCuantitativoNivel() {
		return razonamientoCuantitativoNivel;
	}

	public void setRazonamientoCuantitativoNivel(String razonamientoCuantitativoNivel) {
		this.razonamientoCuantitativoNivel = razonamientoCuantitativoNivel;
	}

	public String getLecturaCritica() {
		return lecturaCritica;
	}

	public void setLecturaCritica(String lecturaCritica) {
		this.lecturaCritica = lecturaCritica;
	}

	public String getLecturaCriticaNivel() {
		return lecturaCriticaNivel;
	}

	public void setLecturaCriticaNivel(String lecturaCriticaNivel) {
		this.lecturaCriticaNivel = lecturaCriticaNivel;
	}

	public String getCompetenciasCiudadanas() {
		return competenciasCiudadanas;
	}

	public void setCompetenciasCiudadanas(String competenciasCiudadanas) {
		this.competenciasCiudadanas = competenciasCiudadanas;
	}

	public String getCompetenciasCiudadanasNivel() {
		return competenciasCiudadanasNivel;
	}

	public void setCompetenciasCiudadanasNivel(String competenciasCiudadanasNivel) {
		this.competenciasCiudadanasNivel = competenciasCiudadanasNivel;
	}

	public String getIngles() {
		return ingles;
	}

	public void setIngles(String ingles) {
		this.ingles = ingles;
	}

	public String getInglesNivel() {
		return inglesNivel;
	}

	public void setInglesNivel(String inglesNivel) {
		this.inglesNivel = inglesNivel;
	}

	public String getProyectosIngenieria() {
		return proyectosIngenieria;
	}

	public void setProyectosIngenieria(String proyectosIngenieria) {
		this.proyectosIngenieria = proyectosIngenieria;
	}

	public String getProyectosIngenieriaNivel() {
		return proyectosIngenieriaNivel;
	}

	public void setProyectosIngenieriaNivel(String proyectosIngenieriaNivel) {
		this.proyectosIngenieriaNivel = proyectosIngenieriaNivel;
	}

	public String getPensamientoMatematico() {
		return pensamientoMatematico;
	}

	public void setPensamientoMatematico(String pensamientoMatematico) {
		this.pensamientoMatematico = pensamientoMatematico;
	}

	public String getPensamientoMatematicoNivel() {
		return pensamientoMatematicoNivel;
	}

	public void setPensamientoMatematicoNivel(String pensamientoMatematicoNivel) {
		this.pensamientoMatematicoNivel = pensamientoMatematicoNivel;
	}

	public String getDisenhoSoftware() {
		return disenhoSoftware;
	}

	public void setDisenhoSoftware(String disenhoSoftware) {
		this.disenhoSoftware = disenhoSoftware;
	}

	public String getDisenhoSoftwareNivel() {
		return disenhoSoftwareNivel;
	}

	public void setDisenhoSoftwareNivel(String disenhoSoftwareNivel) {
		this.disenhoSoftwareNivel = disenhoSoftwareNivel;
	}

	public String getNivelDeIngles() {
		return nivelDeIngles;
	}

	public void setNivelDeIngles(String nivelDeIngles) {
		this.nivelDeIngles = nivelDeIngles;
	}

	
	
}
