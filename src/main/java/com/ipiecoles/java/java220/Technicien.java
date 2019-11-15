package com.ipiecoles.java.java220;

import java.util.Objects;

import org.joda.time.LocalDate;

public class Technicien extends Employe implements Comparable<Technicien>{
	
	
	private Integer grade;
	
	
	public Technicien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Technicien(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire, Integer grade) {
		super(nom, prenom, matricule, dateEmbauche, salaire);
		this.grade = grade;
		// TODO Auto-generated constructor stub
	}
	

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(),grade);
	}
	
	@Override
	public void setSalaire (Double salaire) {
		super.setSalaire(salaire*(1+ (double) grade/10));
	}
	
	@Override
	public Integer getNbConges() {
		return (Entreprise.NB_CONGES_BASE+getNombreAnneeAnciennete());
	}	
	
	@Override 
	public Double getPrimeAnnuelle()  {	
		return ( Entreprise.primeAnnuelleBase()*(1+ (double) grade/10)+(Entreprise.PRIME_ANCIENNETE*getNombreAnneeAnciennete()) );	
	}
	

	@Override
	public int compareTo(Technicien o) {
		return Integer.compare(this.grade, o.grade);
	}
	
	
}


