package hassane;

import java.util.Scanner;

public class Stringlearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="    hassane made  my space    ";
       // String age="tom was 35 years old";
	
		
		//String upper = str.toUpperCase();
		//System.out.println(upper);//upper case
		//System.out.println(str.toUpperCase());//upper case
		//System.out.println(str.toLowerCase());//lower case
		//System.out.println(str.trim());//remove the space
		//System.out.println(str.concat("back in 2005"));
		//System.out.println(str.concat  (age ));//add string age to str
		//System.out.println(str.contains("tom"));//
		//System.out.println(str.replace("hassane",""));//replace tom by mark
		//System.out.println("hassane".substring(2,6));
		Scanner sc=new Scanner(System.in);
		System.out.println("what is your name ?");
		
		String x=sc.next();
		System.out.println("how old are you");
		int hassane=sc.nextInt();
		
		
		if (hassane<=20 || hassane==10)//no semicolon ||for or//if string you need to put equal instead of ==
		{
         	System.out.println("we get it");
		}
		else  if(hassane>20 && hassane<10)//&& for and
	{
		System.out.println("not true");
	}
		else 
		{ 
			System.out.println("good");
	}
//wg since the string refere to datatype 
	//== just look to the data
	// string 
	}
	}


