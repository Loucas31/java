/**
 * 
 */
package hello.utilisateurs;

import hello.livre.Livre;
import hello.utilisateurs.interfaces.LoueurInterface;

/**
 * @author Dell
 *
 */
public class CreateUsers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
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
		
		
		
	}
	
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
