package com.example.demo.entities;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="client")
public class Client {
	
	private String id;
	
	private long code;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	
	
	
	
	
	
	public Client() {
		super();
	}
	public Client(long code, String nom, String prenom, Date dateNaissance) {
		super();
		this.code = code;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
	}
	public Client(String id, long code, String nom, String prenom, Date dateNaissance) {
		super();
		this.id = id;
		this.code = code;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public long getCode() {
		return code;
	}
	public void setCode(long code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	
	

}
