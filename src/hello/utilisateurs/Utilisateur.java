package hello.utilisateurs;

abstract public class Utilisateur {
	protected String nom;
	protected String prenom;
	protected String numAdherent;
	
	public String nom() {
	return this.nom;
	}
	public Utilisateur nom(String nom) {
		this.nom = nom;
		return this;
	}
	
	public String prenom() {
		return this.prenom;
	}
	
	public Utilisateur prenom(String prenom) {
		this.prenom=prenom;
		return this;
	}
	
	public String numAdherent() {
		return this.numAdherent;
	}

	public Utilisateur numAdherent(String numAdherent) {
		this.numAdherent = numAdherent;
		return this;
	}
	
	
	
}
