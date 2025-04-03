package histoire;

import java.util.Random;

import personnages.Commercant;
import personnages.Samourai;

public class Traitre extends Samourai{
	
	private int niveauTraitrise = 0;
	
	public Traitre(String seigneur, String nom, String boissonFavorite, int argent) {
		super(seigneur, nom, boissonFavorite, argent);
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mais je suis un tra�tre et mon niveau de tra�trise est : " + niveauTraitrise+ ". Chut !");
	}
	
	public void ranconner(Commercant commercant) {
		if (niveauTraitrise < 3){
			int argentCommercant = commercant.getArgent();
			int argentRanconner = argentCommercant * 2/10;
			commercant.perdreArgent(argentRanconner);
			gagnerArgent(argentRanconner);
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne-moi " + argentRanconner + " sous ou gare � toi !");
			niveauTraitrise++;
			commercant.seFaireRanconner(this);
		}
		else {
			parler("Mince je ne peux plus ran�onner personne sinon un samoura� risque de me d�masquer !");
		}
	}
	
	public void faireLeGentil() {
		if (nombreConnaissance < 1) {
			parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif.");
		}
		else {
			int humainRandom = (int)(Math.random() * 5);
		}
	}

}
