/**
 * 
 */
package hello;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import hello.livre.Auteur;
import hello.livre.Livre;

/**
 * @author Dubluc
 *
 */
public class Hello {

	/**
	 * @param args
	 * public
	 * static: c'est une methode qui peut etre appellée sans avoir fait une instance de la classe au prealable.
	 * void (type de retour, on le met avant la fonction)
	 * "String" object de type chaine
	 * "String[]" tableau de type chaine
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		System.out.println("Hello Java");
		
		// premiere façon
		
		// Utilisateur moi = new Utilisateur();
		Utilisateur moi = new Loueur();
		moi.nom = "Tartempion";
		System.out.println(moi.nom);
		
		moi.setNom("TarTemipn");
		moi.setPrenom("loulou");
		moi.setNumAdherent("000002165");
		System.out.println("Utilisateur est: " + moi.getNom());
		
		// 2eme façon
		//Utilisateur moi2 = new Utilisateur("Begood","Johny", "0453221");
		Utilisateur moi4 = new Loueur("Begood","Johny", "0453221");
		System.out.println("Le second Utilisateur est : " + moi4.getNom());
		
		
		// 3eme façon d'appel
		//Utilisateur alien = new Utilisateur();
		
		Utilisateur alien = new Loueur();
		alien
			.nom("ET")
			.prenom("Dvorak")
			.numAdherent("64233165");
		System.out.println("Retour Maison : " + alien.nom());
		
		Livre fondation = new Livre();
		fondation
				.titre("fondation")
				.resume("Seldon sauve le monde")
				.nbPages(287);
		System.out.println("Et nous avons le livre :" + fondation.titre() + "de " + fondation.nbPages());

		
		Livre miserable = new Livre("miserable", " ils sont pauvres",3 );
		System.out.println("Et nous avons le livre :" + miserable.titre() + "de " + miserable.nbPages());
		
		
		//Auteur
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse("2020-01-02");
		Auteur hugo = Auteur.getAuteur("hugo","victor", date);
		if(hugo == null)
		{System.out.println("impossible d'instancier hugo");}
		else System.out.println("Auteur" + hugo.nom() + "date naissance" + hugo.naissance());
		
		Date date2 = format.parse("1980-02-02");
		Auteur asimov = Auteur.getAuteur("Asimov", "Isaac", date2);
		System.out.println("Auteur" + asimov.nom() + "date naissance" + asimov.naissance());
		
		
		// Couts actuels
		Evolutionvar couts = new Evolutionvar();
		couts.coutCotisation(15)
			.reductionCotisation(0.05)
			.nblivreMinreduc(30)
			.coutTVA(0.20);
		((Loueur)alien).nbLivreLoueur(29);
		((Loueur)alien).facture(couts.coutCotisation(),couts.reductionCotisation(),couts.nblivreMinreduc(),couts.coutTVA());
		System.out.println("La facture de " + ((Loueur)alien).getNom() +"est de " + ((Loueur)alien).facture());
		
		couts.coutJouremprunt(0.05);
		
		Utilisateur roger = new Emprunteur();
		roger
		.nom("Moore")
		.prenom("roger")
		.numAdherent("000000316465");
		
		((Emprunteur)roger).facture(couts.coutJouremprunt());
		System.out.println("La facture de l'emprunteur est" + ((Emprunteur)roger).facture());
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un mot :");
		String str = sc.nextLine();
		System.out.println("Vous avez saisi : " + str);
		sc.close();
		
		
		

		
		
	}
	
	

}
