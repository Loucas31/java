/**
 * 
 */
package hello;

/**
 * @author Dell
 *
 */
public class Emprunteur extends Utilisateur {

	/**
	 * Attributs
	 */
	private int livrejour1=10;
	private int livrejour2=15;
	private int livrejour3=30;
	private double facture;
	
	
	
	public Emprunteur() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nom
	 * @param prenom
	 * @param numAdherent
	 */
	public Emprunteur(String nom, String prenom, String numAdherent) {
		super(nom, prenom, numAdherent);
		// TODO Auto-generated constructor stub
	}
	
	public final double facture() {
		return this.facture;
		}
	public final Emprunteur facture( double coutJouremprunt) {
		this.facture= coutJouremprunt*this.livrejour1 + 
				coutJouremprunt*this.livrejour2 + 
				coutJouremprunt*this.livrejour3 ;
		return this;
		}
	
	
	

}
