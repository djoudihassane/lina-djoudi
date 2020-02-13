package HardestWork;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class date_time {

	public static void main(String[] args) throws IOException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss") ;
		Date date = new Date() ;
		String datetime = dateFormat. format(date);
		

		File file = new File("c:\\data\\abc_"+datetime+"txt");
		
		if(!file.exists()) {
			
			System.out.println("file not excistes");
			filebytime.print(".\\data\\abc_"+datetime + ".txt" , "my daugther name is lina");
			}
			
			else {
				System.out.println(" file is  exist");
				
				//filebytime.print(".\\data\\abc_"+ datetime +".txt", "my daugther name is lina");
			}}
	}
		

