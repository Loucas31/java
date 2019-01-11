package hello.tools;

import java.io.File;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AuteurImport {
	
	///////////////// Attributs ////////
	private File auteurfile;
	private static final String FIELD_SEP = ";";
	private ArrayList<String[]> auteurs;
	/////////////////Constructeur //////////////
	public AuteurImport() {
		// TODO Auto-generated constructor stub
		this.auteurs = new ArrayList<String[]>();
		// Instancier la classe File donc creer l 'objet auteurfile
		this.auteurfile = new File("C:\\workspace\\fichierauteur\\auteursjava.txt");
		if (this.auteurfile.exists()) 
			{//System.out.println("le fichier est la");
			if(this.auteurfile.canRead()) {
				this.process();
			}else System.out.println("le fichier n'est pas lisible");
			}
		else System.out.println("le fichier n'est pas là");;
		
	}
	/////////////////methode  //////////////
	
	public ArrayList<String[]> getAuteurs(){
		return this.auteurs;
	}
	/**
	
	 * */
	private void process() {
		//While (String rows){}
		try {
			//FileReader fr = new FileReader(auteurfile);
			int rowCount = 0;
			Scanner fileScanner = new Scanner(this.auteurfile);
			System.out.println("Saluuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuut");
			while(fileScanner.hasNext()) {
				System.out.println("caca");
				String row = fileScanner.nextLine();
				if(rowCount > 0) {
					// On doit passer row
					
					String[] cols = row.split(AuteurImport.FIELD_SEP);
					this.auteurs.add(cols);
					
					/**  ///////////////////////////////
					String message = "";
					for (int i=0; i< cols.length; i++) {
						message += cols[i] + " ";
					}
					message += "\n";
					System.out.println(message);
					*///////////////////////////////////
				}
				rowCount++;
			}
			
		}catch(IOException ioe){System.out.println("Probleme de lecture");}
	}
	
	

}
