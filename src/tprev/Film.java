package tprev;

public class Film extends Evenement {

	private String producteur;
	private String genre;
	
	public Film(String titre, int duree, String[] acteurs, String realisteur, String producteur, String genre) {
		super(titre, duree, acteurs, realisteur);
		this.producteur = producteur;
		this.genre = genre;
	}

	@Override
	public String toString() {
		return super.toString()+"Film [producteur=" + producteur + ", genre=" + genre + "]";
	}

	public String getProducteur() {
		return producteur;
	}

	public String getGenre() {
		return genre;
	}
	
	
	
	
}
