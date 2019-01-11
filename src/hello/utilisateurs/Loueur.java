/**
 * 
 */
package hello.utilisateurs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import hello.livre.Livre;
import hello.utilisateurs.interfaces.LoueurInterface;

/**
 * @author Dell
 *
 */
// Interface fonctionnelle
interface GetSize{
	public int getSize(HashMap<Livre,Integer>livres, boolean getStock );
	//public int getSize(HashMap<Livre,Integer>livres);
}


public class Loueur extends Utilisateur implements LoueurInterface{

	// Attributs
	//private ArrayList<Livre> books; 
	private HashMap<Livre, Integer>books2;
	//private ArrayList<Livre, Integer> books3; //marche pas
	// <> est un specifieur
	// ArrayList est un tableau dynamique.... une collection d'objet
	private String message;
	private String message2;
	/**
	 * 
	 */
	public String booksNumber() {
		String message = "Cette collection est de" + this.books2.size();
		return message;
	}
	
	public Loueur() {
		// TODO Auto-generated constructor stub
		//this.books = new ArrayList<Livre>(); // il y a des () car c'est un constructeur !!!!!
		this.books2 = new HashMap<Livre, Integer>();
	
	}
	public String listBooks() {
		message = "Livres de la collection de " + this.nom + "\n";
		//Boucle for sur la collection des livres
		//for (Livre livre: this.books) message+= livre.titre() +"\n";
		//Methode Lucas
		 message2 = "Livres de la collection de " + this.nom + "\n";
		 this.books2.forEach((k,v) -> message2 += "livres    " +k.titre() + "  quantite     " +v +"\n");
		 /*
		 
		 this.books2.forEach((k,v) -> toMessage("livre " +k + "quantite" +v +"\n"));
		
		System.out.println("A forEach message : " + message);
		
		this.books2.forEach((k,v) -> message = ( "livre " +k + "quantite" +v +"\n").toString());
		
		System.out.println("A forEach message : " + message);
		
		*/
		/*
		/// Methode Logitan
		for(Map.Entry<Livre, Integer>livre : this.books2.entrySet()) {
			message += livre.getKey().titre() + " & nombre" + livre.getValue() + "\n";
		}
		
		// Methode Jeremy
        for (Livre livre7 : this.books2.keySet()) {
            message += livre7.titre() + ", qte : " + this.books2.get(livre7) + "\n";
        }
        
		/// Methode Jean Luc
		Set<Entry<Livre,Integer>> entries = this.books2.entrySet();
		Iterator <Entry<Livre, Integer>>iterator = entries.iterator();
		while (iterator.hasNext()) {
			Map.Entry<Livre, Integer> entry = iterator.next();
			Livre livre5 = entry.getKey();
			Integer occurences = entry.getValue();
			message += livre5.titre() + "(" + occurences + ")\n";
		}

		*/
		
		
		
		return message2;
		
	}

	@Override
	public Utilisateur addBook(Livre livre) {
		// TODO Auto-generated method stub
		if (this.books2.containsKey(livre)) this.books2.replace(livre, this.books2.get(livre)+1);
		else this.books2.put(livre,1);
		return this;
	}
	public boolean checkLivre(Livre livre){
		return (this.books2.containsKey(livre) && (this.books2.get(livre)>0 ));
	}
	@Override
	public Utilisateur loan(Livre livre) {
		// TODO Auto-generated method stub
			this.books2.replace(livre, this.books2.get(livre)-1);
			if (this.books2.get(livre)==0) this.books2.remove(livre);
		
		return this;
	}

	@Override
	public Utilisateur calculeCotisation(Livre livre) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int getCollectionSize (boolean asStock) {
		
		GetSize size = (collection, getStock) ->
		{
			if(!getStock) {
				return collection.size();
			} else {
				int stock = 0;
				for (Livre livre : collection.keySet()) {
					stock = stock + collection.get(livre);
				}
				return stock;
			}
			
		};
		
		//@TODO complete ligne en dessous
		return size.getSize(this.books2,asStock);
	}


}
