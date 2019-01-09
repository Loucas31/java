/**
 * 
 */
package hello.utilisateurs;

import java.util.ArrayList;

import hello.livre.Livre;
import hello.utilisateurs.interfaces.LoueurInterface;

/**
 * @author Dell
 *
 */
public class Loueur extends Utilisateur implements LoueurInterface{

	// Attributs
	private ArrayList<Livre> books; 
	//private ArrayList<Livre: int> books2;
	// <> est un specifieur
	// ArrayList est un tableau dynamique.... une collection d'objet
	
	/**
	 * 
	 */
	public String booksNumber() {
		String message = "Cette collection est de" + this.books.size();
		return message;
	}
	
	public Loueur() {
		// TODO Auto-generated constructor stub
		this.books = new ArrayList<Livre>(); // il y a des () car c'est un constructeur !!!!!
	
	}
	public String listBooks() {
		String message = "Livres de la collection de " + this.nom + "\n";
		//Boucle for sur la collection des livres
		for (Livre livre: this.books) message+= livre.titre() +"\n";
		return message;
	}

	@Override
	public Utilisateur addBook(Livre livre) {
		// TODO Auto-generated method stub
		if (!this.books.contains(livre)) this.books.add(livre);
		return this;
	}

	@Override
	public Utilisateur loan(Livre livre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur calculeCotisation(Livre livre) {
		// TODO Auto-generated method stub
		return null;
	}

}
