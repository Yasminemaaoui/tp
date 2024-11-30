package tprev;

public class Theatre extends Evenement{
	private String auteur;

	public Theatre(String titre, int duree, String[] acteurs, String realisteur, String auteur) {
		super(titre, duree, acteurs, realisteur);
		this.auteur = auteur;
	}

	@Override
	public String toString() {
		return super.toString()+"Theatre [auteur=" + auteur + "]";
	}

	public String getAuteur() {
		return auteur;
	}
	
}
