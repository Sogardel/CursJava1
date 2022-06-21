package curs10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFilesProcessor {
	
	public void writePropertiesFile() throws IOException  {
		
		try {
			OutputStream outputStream =  new FileOutputStream("test.properties");
			Properties prop = new Properties();
			//definim continutul
			prop.setProperty("user", "testUser");
			prop.setProperty("pass", "admin123");
			prop.setProperty("email", "test@testUser.com");
			//salvam
			prop.store(outputStream, "am salvat fisierul properties");
			System.out.println(prop);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void readPropertiesFile(String key) throws IOException {
		
		InputStream inputStream =  new FileInputStream("test.properties");
		Properties prop  = new Properties();
		prop.load(inputStream);
		
		String value =prop.getProperty(key);
		System.out.println(value);
		
	}
	
	

}
