package personnages;

public class Humain {
	protected String nom;
	private String boissonFavorite;
	protected int argent;
	protected Humain[] memoire= new Humain[30];
	protected int nombreConnaissance = 0;
	
	public Humain(String nom, String boissonFavorite, int argent) {
		super();
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	protected void parler(String texte) {
		System.out.println("(" + nom + ")" + " : " + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFavorite + ".");
		
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			argent -= prix;
			parler(" J'ai "+ argent +" sous en poche. Je vais pouvoir m'offrir " + bien +" � " + prix +" sous.");
		}
		else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux m�me pas m'offrir " + bien + " � " + prix + " sous.");
		}
	}
	
	public void gagnerArgent(int quantite) {
		argent += quantite;
	}
	
	public void perdreArgent(int quantite) {
		argent -= quantite;
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
	}
	
	protected void memoriser(Humain autreHumain) {
		if (nombreConnaissance < 30) {
			memoire[nombreConnaissance] = autreHumain;
			nombreConnaissance++;
		}
		else {
			for (int i = 1; i < nombreConnaissance; i++) {
				memoire[i-1] = memoire[i];
			}
			memoire[nombreConnaissance-1] = autreHumain;
		}
	}
	
	public void listerConnaissance() {
		String[] listeConnaissance = new String[30];
		for (int i = 0; i < nombreConnaissance; i++) {
			listeConnaissance[i] = memoire[i].toString();
		}
		String texte = listeConnaissance[0];
		for (int i = 1;i < nombreConnaissance; i++) {
			texte = texte + ", " + listeConnaissance[i];
		}
		parler("Je connais beaucoup de monde dont : " + texte);
	}
	
	protected void repondre(Humain autreHumain) {
		direBonjour();
		memoriser(autreHumain);
	}
	
	@Override
	public String toString() {
		return nom;
	}
}
