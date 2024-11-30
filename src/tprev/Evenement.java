package tprev;

import java.util.Arrays;

public class Evenement {

	private String titre;
	private int duree;
	private String[] acteurs;
	private String realisteur;
	
	public Evenement(String titre, int duree, String[] acteurs, String realisteur) {
		super();
		this.titre = titre;
		this.duree = duree;
		 this.acteurs = acteurs != null ? acteurs : new String[0];
		 this.realisteur = realisteur;
	}
	
	@Override
	public String toString() {
		return "Evenement [titre=" + titre + ", duree=" + duree + ", acteurs=" + Arrays.toString(acteurs)
				+ ", realisteur=" + realisteur + "]";
	}
	public String getTitre() {
		return titre;
	}
	public int getDuree() {
		return duree;
	}
	public String getRealisteur() {
		return realisteur;
	}
	
	public boolean acteurIn(String s) {
		for(int i=0;i<acteurs.length;i++) {
			if(acteurs[i].equalsIgnoreCase(s)) {
				return true;
			}
		}
		return false;
	}
	
	
}
