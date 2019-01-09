/**
 * 
 */
package hello.utilisateurs;

import hello.livre.Livre;
import hello.utilisateurs.interfaces.EmprunteurInterface;
import hello.utilisateurs.interfaces.LoueurInterface;

/**
 * @author Dell
 *
 */
public class EmprunteurLoueur extends Utilisateur implements EmprunteurInterface, LoueurInterface {

	/**
	 * 
	 */
	public EmprunteurLoueur() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see hello.utilisateurs.interfaces.LoueurInterface#addBook(hello.livre.Livre)
	 */
	@Override
	public Utilisateur addBook(Livre livre) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see hello.utilisateurs.interfaces.LoueurInterface#loan(hello.livre.Livre)
	 */
	@Override
	public Utilisateur loan(Livre livre) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see hello.utilisateurs.interfaces.LoueurInterface#calculeCotisation(hello.livre.Livre)
	 */
	@Override
	public Utilisateur calculeCotisation(Livre livre) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see hello.utilisateurs.interfaces.EmprunteurInterface#facturation()
	 */
	@Override
	public Utilisateur facturation() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see hello.utilisateurs.interfaces.EmprunteurInterface#createBookBorrowing(hello.utilisateurs.Loueur, hello.livre.Livre)
	 */
	@Override
	public Utilisateur createBookBorrowing(Loueur loueur, Livre livre) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see hello.utilisateurs.interfaces.EmprunteurInterface#returnBook(hello.utilisateurs.Loueur, hello.livre.Livre)
	 */
	@Override
	public Utilisateur returnBook(Loueur loueur, Livre livre) {
		// TODO Auto-generated method stub
		return null;
	}

}
