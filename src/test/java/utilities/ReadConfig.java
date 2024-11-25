package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	String path = "D:\\Projects\\com.hms.automation\\configuration\\config.properties";
	
	public ReadConfig() {
		
		pro = new Properties();
		
		/*
		 * FileInputStream is used to read data from a file. 
		 * In this context, it reads the .properties file and allows 
		 * the Properties object to load and access the key-value pairs
		 */
		
		FileInputStream fis;
		try {
			
			//loads the file
			fis = new FileInputStream(path);
			
			// loads the key-value pairs from the .properties file into the Properties object.
			pro.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String getApplicationUrl() {
		
		return pro.getProperty("baseUrl");
	}
	
	public String getUsername() {
		
		return pro.getProperty("username");
	}
	
	public String getPassword() {
		
		return pro.getProperty("password");
	}

}
