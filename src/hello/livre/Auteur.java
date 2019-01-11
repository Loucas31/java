/**
 * 
 */
package hello.livre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import hello.livre.exceptions.Birthdateexceptions;

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
	public static Auteur getAuteur(String nom, String prenom, Date naissance) throws Birthdateexceptions // comme si j'avais ecrit une fonction
	{
		Date datetoday = new Date(); 
		if (naissance.after(datetoday) ) {
			throw new Birthdateexceptions();
		}
		else {
			Auteur auteur = new Auteur(nom,prenom,naissance);
			return auteur;
		}
			
		
		
	}
	public static Auteur getAuteur() throws ParseException, Birthdateexceptions {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nom de l'auteur : ");
		String nom = scanner.nextLine();
		scanner.reset();
		
		System.out.println("Prenom de l'auteur : ");
		String prenom = scanner.nextLine();
		scanner.reset();
		System.out.println("Date de Naissance de l'auteur : ");
		String naissance = scanner.nextLine();
		scanner.reset();
		
		scanner.close();
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse(naissance);
		return getAuteur(nom,prenom,date);
		
		
		
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
