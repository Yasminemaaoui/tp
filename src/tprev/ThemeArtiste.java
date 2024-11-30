package tprev;

public class ThemeArtiste implements ThemeEvt{
	
	private String artiste;
	
	public ThemeArtiste(String artiste) {
		this.artiste = artiste;
	}


	@Override
	public boolean theme(Evenement Evt) {
			if(Evt instanceof Theatre) {
				return Evt.acteurIn(artiste) || Evt.getRealisteur().equalsIgnoreCase(artiste)|| ((Theatre)Evt).getAuteur().equals(artiste);
			}
			else if(Evt instanceof Film) {
				return Evt.acteurIn(artiste) || Evt.getRealisteur().equalsIgnoreCase(artiste)|| ((Film)Evt).getProducteur().equals(artiste);
			}
			return false;
}



	
	
}
