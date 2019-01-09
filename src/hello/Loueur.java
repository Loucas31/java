package hello;

public class Loueur extends Utilisateur {
	
	//attributs
	
	private int nbLivreLoueur;
	private double facture;

	public final int nbLivreLoueur() {
		return this.nbLivreLoueur;
	}
	public final Loueur nbLivreLoueur(int nbLivreLoueur) {
		this.nbLivreLoueur = nbLivreLoueur;
		return this;
	}
	public final double facture() {
		return this.facture;
	}
	public final Loueur facture(double coutCotisation,double  reductionCotisation,double nblivreMinreduc, double coutTVA) {
		
		
		if(this.nbLivreLoueur < nblivreMinreduc && nbLivreLoueur >0)
			{this.facture = (1+coutTVA)*coutCotisation;
		System.out.println("facture " + this.facture );}
		if (this.nbLivreLoueur >= nblivreMinreduc && nbLivreLoueur >0)
			this.facture = (1+coutTVA)*coutCotisation*(1-reductionCotisation);
		if (this.nbLivreLoueur == 0)
			this.facture = 0;
		return this;
	}
	public Loueur() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param nom
	 * @param prenom
	 * @param numAdherent
	 * */

	public Loueur(String nom, String prenom, String numAdherent) {
		super(nom, prenom, numAdherent);
		// TODO Auto-generated constructor stub
	}
	
	/**
	public Utilisateur setNom(String nom) {
		this.prenom(nom);
		return this;
	}
	// Ne marche pas car dans la classe mere on a mis "final"
*/
}
