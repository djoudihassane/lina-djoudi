package HardestWork;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// Try Run -> Run Config -> Common -> cancel Allocate Console. Does it work for you?

public class filewriter {

	public static void main(String[] args) throws IOException {
	
		
		
		
		
       
           String path = ".\\data\\abctwo.txt";
		
		File NN= new File(path);
       
		FileWriter MM=new FileWriter (NN);
		BufferedWriter AA = new BufferedWriter(MM);
		
		AA.write("jjjjjjjjjjj");
		AA.newLine();
		AA.write("hhhhhhhhh");
		AA.close();
		
	}
		
	}

      
