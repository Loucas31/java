/**
 * 
 */
package hello.livre;

import java.util.Date;

/**
 * @author Dell
 *
 */
public class Auteur {
	
	private String nom;
	private String prenom;
	private Date naissance;
	
	
	
	private Auteur(String nom, String prenom, Date naissance) 
	{
		this.nom = nom;
		this.prenom = prenom;
		this.naissance = naissance;
	}
	
	
	// Ce qu'on cree ici est un static class factory. Un design pattern
	public static Auteur getAuteur(String nom, String prenom, Date naissance) // comme si j'avais ecrit une fonction
	{
		Date datetoday = new Date(); 
		if (naissance.before(datetoday) ) {
			Auteur auteur = new Auteur(nom,prenom,naissance);
			return auteur;
		}
		else return null;
		
	}
	
	public String nom() {
		return nom;
	}
	public Auteur nom(String nom) {
		this.nom = nom;
		return this;
	}
	public String prenom() {
		return prenom;
	}
	public Auteur prenom(String prenom) {
		this.prenom = prenom;
		return this;
	}
	public Date naissance() {
		return naissance;
	}
	public Auteur naissance(Date naissance) {
		this.naissance = naissance;
		return this;
	}
	
	

}
