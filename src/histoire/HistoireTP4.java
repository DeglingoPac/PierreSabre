package histoire;

import personnages.Commercant;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Ronin roro = new Ronin("Roro", "Shochu", 60);
		roro.direBonjour();
		roro.donner(marco);
	}
}