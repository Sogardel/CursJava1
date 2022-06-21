package curs10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFileProcessor {
	
	
	/*
	 * write a new text file
	 */
	public void writeFile(String textToWrite) {
		
		try {
			FileWriter myFileWriter =  new FileWriter("file.txt");
			myFileWriter.write(textToWrite);
			myFileWriter.close();
			System.out.println("Sucessfully wrote to file!");
			
			
		} catch (IOException e) {
			System.out.println("Nu am gasit fisierul!");
			e.printStackTrace();
		}		
	}
	/*
	 * read txt from file
	 * 
	 */
	
	public void readFile() {
		
		File objFile =  new File("file.txt");
		try {
			Scanner fileReader =  new Scanner(objFile);
			
			while(fileReader.hasNext()) {
				String text =  fileReader.nextLine();
				System.out.println("text file :" + text);
			}
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Nu am gasit fisierul!");
			e.printStackTrace();
		}
		
	}
	
	/*
	 * append to file
	 */
	public void appendTextToFile(String textToWrite) throws IOException {
		
		try(FileWriter myWriter =  new FileWriter("file.txt", true)){
			
			myWriter.write(textToWrite);
			System.out.println("Append to file");
		
		}
		
		//try(){}
		
		
	/*	 try { 
			 FileWriter myWriter = new FileWriter("file.txt", true);
			 myWriter.write(textToWrite); 
			 System.out.println("Append to file");
			// myWriter.close(); 
			 }
		 catch (IOException e) { 
			 e.printStackTrace(); 
		 } */
		 	
	}
	
	/*
	 * delete file
	 */
	public void deleteFile() {
		
		File myFile = new File("file.txt");
		myFile.delete();
		
		System.out.println("Delete file :" + myFile.getName());
		
	}
	

}
