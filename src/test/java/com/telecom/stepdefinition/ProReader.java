package com.telecom.stepdefinition;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class ProReader {

	public static void main(String[] args) throws Throwable {
		
		 String filepath = System.getProperty("user.dir")+"\\Argument.properties";
		 FileReader reader=new FileReader(filepath);  
	      
		    Properties p=new Properties();  
		    p.load(reader);  
		     
		    
		    String feature = p.getProperty("feature");
		    System.out.println(feature);
	}
	
	
}
