/**
 * 
 */
package hello.livre;

/**
 * @author Dub
 *
 */
public class Livre 
{
	//Attributs
	private String titre;
	private String resume;
	private int nbPages;
	
	// le mot clé final interdit la modification de la valeur
	private final int NBPAGESMIN = 4; // definition de constante de classe
	
	// Constructeur
	public Livre() {}
	public Livre(String titre, String resume, int nbPages) 
	{
		this.titre = titre;
		this.resume = resume;
		if (nbPages >= this.NBPAGESMIN ) 
		{
			this.nbPages = nbPages;				
		}
		else {this.nbPages = this.NBPAGESMIN ;}
		
	}
	
	public String titre()
	{	
		return this.titre;
	}
	
	public String resume()
	{
		return this.resume;
	}
	
	public int nbPages()
	{
		return this.nbPages;
	}
	
	public Livre titre(String titre)
	{
		this.titre = titre;
		return this;
	}
	public Livre resume(String resume)
	{
		this.resume = resume;
		return this;
	}
	public Livre nbPages(int nbPages)
	{
		if (nbPages >= this.NBPAGESMIN ) 
		{
			this.nbPages = nbPages;				
		}
		else {this.nbPages = this.NBPAGESMIN ;}
		return this;
	}
}
