package tprev;

public class OrgniseEvtMois {

	private int mois;
	private ThemeEvt theme;
	private Evenement[] tabEvt;
	

	public OrgniseEvtMois(int mois, ThemeEvt theme) {
		this.mois = mois;
		this.theme = theme;
		this.tabEvt = new Evenement[nbMax()];
	}
	
    public int nbMax() {
        switch (mois) {
            case 2:
                return 28;
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return 31;
        }
    }
    
    public void ajouter(Evenement Evt, int jour) throws EvtException {
        if (jour < 1 || jour > nbMax()) {
            throw new EvtException("Jour Incorrecte");
        }

        if (tabEvt[jour - 1] == null) {
            tabEvt[jour - 1] = Evt;
            return;
        }

        for (int i = 0; i <tabEvt.length; i++) {
            if (tabEvt[i] == null) {
                tabEvt[i] = Evt;
                return;
            }
        }

        throw new EvtException("Complet");
    }
	
	void afficherCalendrierEvts() {
		for(int i=0;i<tabEvt.length;i++) {
			if(tabEvt[i]!=null) {
			System.out.println(tabEvt[i]);
		}}
	}
	
	
    
    
}
