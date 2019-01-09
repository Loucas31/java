package hello;

public class Evolutionvar {
	
	
	/////////////////////////////////////::
	//   public static final double coutCotisation
	//////////////////////////////////////::
	private double coutCotisation;
	private double reductionCotisation;
	private int nblivreMinreduc;
	private double coutTVA;
	
	private double coutJouremprunt;
	
	public Evolutionvar() {};
	
	
	
	public final double coutCotisation() {
		return coutCotisation;
	}
	public final Evolutionvar coutCotisation(double coutCotisation) {
		this.coutCotisation = coutCotisation;
		return this;
	}
	public final double reductionCotisation() {
		return reductionCotisation;
	}
	public final Evolutionvar reductionCotisation(double reductionCotisation) {
		this.reductionCotisation = reductionCotisation;
		return this;
	}
	public final int nblivreMinreduc() {
		return nblivreMinreduc;
	}
	public final Evolutionvar nblivreMinreduc(int nblivreMinreduc) {
		this.nblivreMinreduc = nblivreMinreduc;
		return this;
	}
	public final double coutTVA() {
		return coutTVA;
	}
	public final Evolutionvar coutTVA(double coutTVA) {
		this.coutTVA = coutTVA;
		return this;
	}
	
	public final double coutJouremprunt(){
		return this.coutJouremprunt;
	}
	
	public final Evolutionvar coutJouremprunt(double coutJouremprunt) {
		this.coutJouremprunt= coutJouremprunt;
		return this;
		
	}
	
	
	
	
	
	

}
