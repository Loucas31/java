/**
 * 
 */
package hello.livre.exceptions;

/**
 * @author Dell
 *
 */
public class Birthdateexceptions extends Exception {

	/**
	 * 
	 */
	public Birthdateexceptions() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 */
	public Birthdateexceptions(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 */
	public Birthdateexceptions(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public Birthdateexceptions(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public Birthdateexceptions(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}
	
	
	//// Fin des constructeurs
	//// Methodes publiques
	public String getMessage() {
		return "La date de naissance ne peut pas etre superieure a la date actuelle";
	}
	
	
	
	

}
