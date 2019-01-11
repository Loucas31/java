package hello.tools;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class AuteurImport2 {

	public AuteurImport2() {
		// TODO Auto-generated constructor stub
		
		String fileName = "C:\\workspace\\fichierauteur\\auteursjava.txt";

		//read file into stream, try-with-resources
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

			stream.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
