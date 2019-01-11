package hello.livre;

import java.util.ArrayList;

public class BiblioAuteurs {
	
	private ArrayList<Auteur>  listeauteurs;
	private String message;

	public BiblioAuteurs() {
		// TODO Auto-generated constructor stub
		this.listeauteurs = new ArrayList<Auteur>() ;
		this.message = new String();
	}

	public ArrayList<Auteur> getListeauteurs() {
		return this.listeauteurs;
	}

	public void setListeauteurs(ArrayList<Auteur> listeauteurs) {
		this.listeauteurs = listeauteurs;
	}
	
	public String listBiblio() {
		this.message = " liste des auteurs \n";
		System.out.println(this.message);
		this.listeauteurs.forEach( (a) -> this.message += a.nom() + "\n");
		
		return this.message;
	}
	
	public void addAuteur(Auteur auteur) {
		/**
		if (!this.listeauteurs.contains(auteur)){
			listeauteurs.add(auteur);
		}
		*/
		this.listeauteurs.add(auteur);
		
	}

}
