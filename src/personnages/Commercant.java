package personnages;

public class Commercant extends Humain{
	private static final String boissonFavorite = "thé";
	
	public Commercant(String nom, int argent) {
		super(nom, boissonFavorite, argent);
	}

	public int seFaireExtorquer() {
		parler("J'ai tout perdu ! Le monde est trop injuste...");
		int sommePerdue = argent;
		perdreArgent(sommePerdue);
		return sommePerdue;
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent + " sous ! Je te remercie généreux donnateur !");
	}

	@Override
	public String toString() {
		return nom;
	}
}
