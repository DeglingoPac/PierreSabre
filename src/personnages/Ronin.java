package personnages;

public class Ronin extends Humain{
	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
	}

	private int honneur = 1;
	private int force = honneur*2;
	
	public void donner(Commercant beneficiaire) {
		int don = argent/10;
		parler(beneficiaire + " prend ces " + don + " sous.");
		beneficiaire.recevoir(don);
		argent -= don;
	}
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if (force >= adversaire.getReputation()) {
			parler("Je t’ai eu petit yakusa!");
			honneur += 1;
			force = honneur*2;
			argent += adversaire.argent;
			adversaire.perdre();
		}
		else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			int argentPerdu = argent;
			argent = 0;
			honneur -= 1;
			force = honneur*2;
			adversaire.gagner(argentPerdu);
		}
	}
}
