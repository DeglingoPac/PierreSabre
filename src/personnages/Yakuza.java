package personnages;

public class Yakuza extends Humain{
	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
	}
	private String clan;
	private int reputation = 0;
	
	public void extorquer(Commercant victime) {
		parler(" Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
		parler(victime + ", si tu tiens � la vie donne moi ta bourse !");
		int argentVole = victime.seFaireExtorquer();
		argent += argentVole;
		parler("J�ai piqu� les " + argentVole + " sous de " + victime + ", ce qui me fait " + argent + " sous dans ma poche. Hi ! Hi !");
		reputation += 1;
	}
	
	public int getReputation() {
		return reputation;
	}
	
	
	public int perdre() {
		int perte = argent;
		argent = 0;
		reputation -= 1;
		parler("J’ai perdu mon duel et mes " + perte +" sous, snif... J'ai déshonoré le clan de " + clan + ".");
		return perte;
	}
	
	public void gagner(int gain) {
		reputation += 1;
		argent += gain;
		parler("Ce ronin pensait vraiment battre " + nom + " du clan de " + clan + " ? Je l'ai dépouillé de ses " + gain + " sous");
	}
}
