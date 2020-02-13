package HardestWork;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class filereader {

	public static void main(String[] args) throws IOException {
		
		
		String path = "C:\\Users\\Owner\\eclipse-workspace\\hello word\\data\\abc.txt";
		
		File DJ = new File(path);
		FileReader f = new FileReader (DJ);
		
		BufferedReader MM=new BufferedReader (f);
		 
		System.out.println(MM .readLine());
		System.out.println(MM .readLine());
		

	}

}
