package com.ipiecoles.java.java220;

import java.util.HashSet;

public class Manager extends Employe {
	
	private HashSet<Technicien> equipe = new HashSet<Technicien>();
	
	
	public HashSet<Technicien> getEquipe() {
		return equipe;
	}

	public void setEquipe(HashSet<Technicien> equipe) {
		this.equipe = equipe;
	}


	@Override
	public Double getPrimeAnnuelle() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void ajoutTechnicienEquipe(Technicien t) {
		equipe.add(t);
	}

	@Override
	public void setSalaire(Double salaire) {
		super.setSalaire(salaire*Entreprise.INDICE_MANAGER + (salaire * (double)equipe.size()/10));
	}
	


	
	
}
