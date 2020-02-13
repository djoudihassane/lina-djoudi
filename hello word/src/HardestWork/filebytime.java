package HardestWork;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;

public class filebytime {
 
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss") ;
		Date date = new Date() ;
		String datetime = dateFormat. format(date);
		print(".\\data\\hassane_"+ datetime +".txt", "this my work");
	}

	public static void print(String path , String name) throws IOException {
	//String path = ".\\data\\abctwo.txt";
	
	File NN= new File(path);
   
	FileWriter MM=new FileWriter (NN);
	BufferedWriter AA = new BufferedWriter(MM);
	
	AA.write(name);
	AA.newLine();
	//AA.write(name);
	AA.close();
}}
