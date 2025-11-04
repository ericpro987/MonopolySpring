package com.example.demo;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Color")
public class Color {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	int id;
	@Column
	String nom;
	@OneToMany
	Set<Propietat> propietat = new HashSet<Propietat>();

	public Color() {
		super();
	}

	public Color(String nom) {
		super();
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Set<Propietat> getPropietat() {
		return propietat;
	}

	public void setPropietat(Set<Propietat> propietat) {
		this.propietat = propietat;
	}

	public int getId() {
		return id;
	}

}