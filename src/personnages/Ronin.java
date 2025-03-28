package personnages;

public class Ronin extends Humain{
	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
	}

	private int honneur = 1;
	
	public void donner(Commercant beneficiaire) {
		int don = argent/10;
		parler(beneficiaire + " prend ces " + don + " sous.");
		beneficiaire.recevoir(don);
		argent -= don;
	}
}
