package HardestWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java. util.*;
public class PropetyFile {

	public static void main(String[] args) throws IOException {
		 String path =".\\data\\myfile.properties";   //or
		//String path ="C:\\\\Users\\\\Owner\\\\eclipse-workspace\\\\hello word\\data\\myfile.properties";
		Properties prop = new Properties ();
		
	  FileInputStream fs= new  FileInputStream (path);
	  prop. load(fs) ;
	  
	  System.out.println("your name is "+ prop.getProperty("name"));

	}

}                         
