package com.ipiecoles.java.java220;

import java.util.Objects;

import org.joda.time.LocalDate;

public class Commercial extends Employe{
	
	private static final double PRIME_MINI_COMMERCIAL = 500d;
	private Double caAnnuel;
	private Integer performance;
	
	
	public Commercial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Commercial(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire, Double caAnnuel) {
		super(nom, prenom, matricule, dateEmbauche, salaire);
		this.caAnnuel = caAnnuel;
		// TODO Auto-generated constructor stub
	}
	
	public Commercial(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire, Double caAnnuel, Integer performance) {
		super(nom, prenom, matricule, dateEmbauche, salaire);
		this.caAnnuel = caAnnuel;
		this.performance = performance;
		// TODO Auto-generated constructor stub
	}



	

	public Double getCaAnnuel() {
		return caAnnuel;
	}

	public void setCaAnnuel(Double caAnnuel) {
		this.caAnnuel = caAnnuel;
	}
	
	
	
	public Double getPrimeAnnuelle()  {	
		if (this.caAnnuel == null) {
			return PRIME_MINI_COMMERCIAL;
		}
		Double prime = Math.ceil(this.caAnnuel * 0.05); 
		if (prime>PRIME_MINI_COMMERCIAL) {
			return prime;
		}
		return PRIME_MINI_COMMERCIAL;
			
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), caAnnuel, performance);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Commercial other = (Commercial) obj;
		return Objects.equals(caAnnuel, other.caAnnuel);
	}
	
	public Boolean performanceEgale(Integer perfo) {
		return Objects.equals(this.performance,perfo);
		
	}
	
	
	public Note equivalenceNote() {
		switch (this.performance) {
		case 0: 
		case 50:
			return Note.INSUFFISANT;
		case 100 : 
			return Note.PASSABLE;
		case 150 :
			return Note.BIEN;
		case 200 : 
			return Note.TRES_BIEN;
		default:
		return null;
		}
		
	}
	
	
	

}
