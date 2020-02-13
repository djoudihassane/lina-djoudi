package hassane;

import java.util.Calendar;
import java.util.Scanner;



import java.text.SimpleDateFormat;
public class calculate {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner sc=new Scanner (System.in);
		System.out.println("what  is"+ " your name ");
        String name=sc.next();
		
        System.out.println("what year you were born  "+name);
	    int year=sc.nextInt();
	   // int month=sc.nextInt();
	    //int day=sc.nextInt();
	    
	    Calendar cal = Calendar.getInstance();
      // SimpleDateFormat age = new SimpleDateFormat("mm/ddyyyy");
	  // String DateString=sc.next();
		 int yearborn =cal.get(Calendar.YEAR);//
	   // int monthborn=cal.get(Calendar.MONTH);
	//   int dayborn=cal.get(Calendar.DAY_OF_MONTH);
		int lina= yearborn-year;
	   System.out.println(name +" your are "+lina+ " year old");
	
	
	}

}
