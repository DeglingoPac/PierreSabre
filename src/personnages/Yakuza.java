package personnages;

public class Yakuza extends Humain{
	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
	}
	private String clan;
	private int réputation = 0;
	
	public void extorquer(Commercant victime) {
		parler(" Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime + ", si tu tiens à la vie donne moi ta bourse !");
		int argentVolé = victime.seFaireExtorquer();
		argent += argentVolé;
		parler("J’ai piqué les " + argentVolé + " sous de " + victime + ", ce qui me fait " + argent + " sous dans ma poche. Hi ! Hi !");
		réputation += 1;
	}
}
