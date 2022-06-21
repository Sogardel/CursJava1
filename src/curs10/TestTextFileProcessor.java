package curs10;

import java.io.IOException;

public class TestTextFileProcessor {

	public static void main(String[] args) throws IOException {

		TextFileProcessor textFile = new TextFileProcessor();
		textFile.writeFile("Textul meu scris in fisier\n");
		textFile.readFile();
		textFile.appendTextToFile("Linie noua\n");
		textFile.appendTextToFile("alta linie\n");

		System.out.println("----------------------");
		textFile.readFile();
		textFile.deleteFile();

		
		
	}

}
