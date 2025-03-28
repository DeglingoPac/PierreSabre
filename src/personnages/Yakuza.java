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
}
