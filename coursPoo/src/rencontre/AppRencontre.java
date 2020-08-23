package rencontre;

import java.util.ArrayList;
import java.util.List;

import rencontre.Match;

public class AppRencontre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Arbitre sherif = new Arbitre("Sherif");
	Arbitre juan = new Arbitre("Juan");
	Joueur joe = new Joueur("Joe");
	Joueur paul = new Joueur("Paul");
	Joueur marc = new Joueur("Marc");
	Joueur anne = new Joueur("Anne");
	Joueur diane = new Joueur("Diane");
	Joueur nick = new Joueur("Nick");
	Joueur alain = new Joueur("Alain");
	Joueur jean = new Joueur("Jean");
	Joueur bob = new Joueur("Bob");
	Joueur jule = new Joueur("Jule");
	Joueur sophie = new Joueur("Sophie");
	Joueur nel = new Joueur("Nel");
	
	

	Equipe EquipeA = new Equipe("Equipe A", joe, paul);
	Equipe EquipeB = new Equipe("Equipe B", marc, anne);
	Equipe EquipeC = new Equipe("Equipe C",marc,jule,joe);
	Equipe EquipeD = new Equipe("Equipe D",paul,nel,anne);
	Equipe EquipeE = new Equipe("Equipe E",joe,paul,marc,anne,diane,nick,alain,jean,bob,jule,sophie);
	//Equipe EquipeF = new Equipe("Equipe F",joe,paul,marc,anne,diane,nick,alain,jean,bob,jule,sophie,nel);
	//Equipe EquipeG = new Equipe("Equipe G", joe);
	

	Match.jouerMatchCollectif(EquipeA,EquipeB,sherif);
	Match.jouerMatchIndividuel(joe,anne,juan);

	
	}

}