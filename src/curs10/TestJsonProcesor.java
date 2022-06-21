package curs10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.json.simple.parser.ParseException;

public class TestJsonProcesor {

	public static void main(String[] args) throws IOException, ParseException {

		
		JsonProcesor json =  new JsonProcesor();
		//json.writeJson();
		json.readJsonFile("name");
		
		//String file = "test.json";
		//System.out.println(readJsonAsString(file));		
		
	}
	
	public static String readJsonAsString(String file) throws IOException {
		
		return new String(Files.readAllBytes(Paths.get(file)));
	}
	
	
	

}
