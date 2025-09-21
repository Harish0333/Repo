package com.properties;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws Exception {
	    //Reading the data of properties file
	    FileReader reader=new FileReader("src/com/properties/db.properties");  
	      
	    Properties p=new Properties();  
	    p.load(reader);  //load the properties file
	      
	    System.out.println(p.getProperty("user"));  
	    System.out.println(p.getProperty("password")); 
		System.out.println(p.getProperty("driver"));
	}

}
