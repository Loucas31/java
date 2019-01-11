/**
 * 
 */
package hello.utilisateurs;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import hello.livre.Auteur;
import hello.livre.BiblioAuteurs;
import hello.livre.Livre;
import hello.livre.exceptions.Birthdateexceptions;
import hello.tools.AuteurImport;
import hello.tools.AuteurImport2;
import hello.utilisateurs.interfaces.LoueurInterface;

/**
 * @author Dell
 *
 */
public class CreateUsers {

	/**
	 * @param args
	 * @throws ParseException 
	 * @throws Birthdateexceptions 
	 */
	public static void main(String[] args) throws ParseException, Birthdateexceptions {
		// TODO Auto-generated method stub
		// Il n'existe pas d'instance de CreateUsers, c'est pour cela qu'on fait appel a des methodes "static".
		
		Utilisateur loueur = CreateUsers.createLoueur();
		Utilisateur emprunteur = CreateUsers.createEmprunteur();
		Utilisateur emprunteurLoueur = createEmprunteurLoueur();
		
		if (loueur instanceof Loueur) {
			System.out.println(loueur.nom()+ "est un loueur");
		} else {
			System.out.println(loueur.nom()+ "n est pas un loueur");
		}
		
		if (emprunteur instanceof Loueur) {
			System.out.println(emprunteur.nom()+ "est un loueur");
		} else {
			System.out.println(emprunteur.nom()+ "n est pas un loueur");
		}
		if (emprunteurLoueur instanceof EmprunteurLoueur) {
			System.out.println(emprunteurLoueur.nom()+ "est un emprunteurloueur");
		} else {
			System.out.println(emprunteurLoueur.nom()+ "n est pas un emprunteurloueur");
		}
		if (loueur instanceof Utilisateur) {
			System.out.println(loueur.nom()+ "est un Utilisateur");
		} else {
			System.out.println(loueur.nom()+ "n est pas un Utilisateur");
		}		

		if (loueur instanceof LoueurInterface) {
			System.out.println(emprunteur.nom()+ "est un loueurinterface");
		} else {
			System.out.println(emprunteur.nom()+ "n est pas un loueurinterface");
		}
		
		//////////////////////   Creer un livre //////////////////
		Livre livre = new Livre();
		livre
		.titre("Les Miserables")
		.resume("Blah blah blah")
		.nbPages(520);
		Livre livre2 = new Livre("titre2","resume2", 320);
		((Loueur)loueur).addBook(livre);
		((Loueur)loueur).addBook(livre);
		((Loueur)loueur).addBook(livre);
		((Loueur)loueur).addBook(livre);
		((Loueur)loueur).addBook(livre2);
		
		String message = ((Loueur)loueur).booksNumber();
		System.out.println(message);
		message = ((Loueur)loueur).listBooks();
		System.out.println(message);
		
		// Creation d un Auteur
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
		Date date2 = format2.parse("2010-01-02");
		Auteur hugo2 = Auteur.getAuteur("hugo","victor", date2);
		if(hugo2 == null)
		{System.out.println("impossible d'instancier hugo");}
		else System.out.println("Auteur" + hugo2.nom() + "date naissance" + hugo2.naissance());
		/**
		 //Ne gere pas les exceptions
		 
		Auteur asimov2 = Auteur.getAuteur();
		if(asimov2 == null)
		{System.out.println("impossible d'instancier hugo");}
		else System.out.println("Auteur" + asimov2.nom() + "date naissance" + asimov2.naissance());		
		*/
		////////////////////////////////////////////////////////////////////
		// Gerer les exceptions, use case 2: par l ligne de commande
		////////////////////////////////////////////////////////////////////
		/**
		try {
			Auteur asimov2 = Auteur.getAuteur();
			System.out.println(asimov2.nom());
		} catch(ParseException parseException) {
			System.out.println("La date de naissance est incorrecte");
			//System.out.println(parseException.getMessage());
			System.out.println(parseException.getLocalizedMessage());
		}catch(Birthdateexceptions naissance) {
			System.out.println(naissance.getMessage());
		}
		*/
		AuteurImport auteurimport = new AuteurImport();
		System.out.println("Youlouuuuuuuuuuhhhhh");
		ArrayList<String[]> auteursliste = new ArrayList<String[]>();
		auteursliste = auteurimport.getAuteurs();
		auteursliste.get(1);
		System.out.println(auteursliste.get(1));
		System.out.println(auteursliste.get(1)[1]);
		auteursliste.size();
		

		BiblioAuteurs biblioauteur = new BiblioAuteurs();
		
		for(int i=0;  i<auteursliste.size(); i++) {
			System.out.println(auteursliste.get(i)[0] + " " + auteursliste.get(i)[1] +" " +auteursliste.get(i)[2]);
			date2= format2.parse(auteursliste.get(i)[2]);
			System.out.println(date2);
			hugo2 = Auteur.getAuteur(auteursliste.get(i)[0],auteursliste.get(i)[1], date2);
			System.out.println(hugo2.nom());
			biblioauteur.addAuteur(hugo2);
			System.out.println("byebye");

			
		}
		System.out.println(biblioauteur.listBiblio());
		
		//AuteurImport2 auteurimport2 = new AuteurImport2();
		//
		//////////////////////////////////////////////////////////////////////
		
		
		
		/**
		
		if (((Loueur)loueur).checkLivre(livre2)) {
			System.out.println("le livre est dispo");
			((Loueur)loueur).loan(livre2);
		} else System.out.println("le livre n est pas dispo");
		message = ((Loueur)loueur).booksNumber();
		message = ((Loueur)loueur).listBooks();
		System.out.println("WALLLLLLLLAAAAAAAHHHHH");
		System.out.println(message);
		
		*/
		}
	/**	
	 *
		// Loueur to Emprunteur
		
		Utilisateur emprunteur2 = CreateUsers.createEmprunteur(loueur);
		loueur = null;
		System.gc();
		loueur = CreateUsers.createEmprunteur(emprunteur2);
		emprunteur2 = null;	
		
		if (loueur instanceof Loueur) {
			System.out.println(loueur.nom()+ "est un loueur");
		} else {
			System.out.println(loueur.nom()+ "n est pas un loueur");
		}
		
		if (loueur instanceof Emprunteur) {
			System.out.println(emprunteur.nom()+ "est un loueur");
		} else {
			System.out.println(emprunteur.nom()+ "n est pas un loueur");
		}
		
		if (loueur instanceof LoueurInterface) {
			System.out.println(emprunteur.nom()+ "est un loueurinterface");
		} else {
			System.out.println(emprunteur.nom()+ "n est pas un loueurinterface");
		}
		
*/
		
		
		
	
	
	private static Utilisateur createLoueur() {
		return new Loueur()
				.nom("Aubert")
				.prenom("Jean Luc")
				.numAdherent("00114521");
	}
	private static Utilisateur createLoueur(String nom, String prenom, String numAdherent) {
		return new Loueur()
				.nom(nom)
				.prenom(prenom)
				.numAdherent(numAdherent);
	}
	private static Utilisateur createLoueur( Utilisateur utilisateur) {
		return new Loueur()
				.nom(utilisateur.nom())
				.prenom(utilisateur.prenom())
				.numAdherent(utilisateur.numAdherent());
	}	
	private static Utilisateur createEmprunteur() {
		return new Emprunteur()
				.nom("Talaron")
				.prenom("Delphine")
				.numAdherent("0044632321");
	}

	private static Utilisateur createEmprunteur(String nom, String prenom, String numAdherent) {
		return new Emprunteur()
				.nom(nom)
				.prenom(prenom)
				.numAdherent(numAdherent);
	}	
	
	
	private static Utilisateur createEmprunteur(Utilisateur utilisateur) {
		return new Emprunteur()
				.nom(utilisateur.nom())
				.prenom(utilisateur.prenom())
				.numAdherent(utilisateur.numAdherent());
	}	
	
	private static Utilisateur createEmprunteurLoueur() {
		return new EmprunteurLoueur()
				.nom("Hue")
				.prenom("Robert")
				.numAdherent("0043685215");
	}
	
	private static Utilisateur createEmprunteurLoueur(String nom, String prenom, String numAdherent) {
		return new EmprunteurLoueur()
				.nom(nom)
				.prenom(prenom)
				.numAdherent(numAdherent);
	}
	
	private static Utilisateur createEmprunteurLoueur(Utilisateur utilisateur) {
		return new EmprunteurLoueur()
				.nom(utilisateur.nom())
				.prenom(utilisateur.prenom())
				.numAdherent(utilisateur.numAdherent());
	}
	

	
	
	
	
	
}
