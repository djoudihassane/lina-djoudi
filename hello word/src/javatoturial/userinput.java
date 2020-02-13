package javatoturial;

import java.util.Scanner;

public class userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter some number");
	int user_input_number = scan.nextInt();
	
	System.out.println("the enterd value is");
	System.out.print(user_input_number);
Scanner scan1=new Scanner(System.in);
	
	System.out.println("Enter some decima value");
	double user_input_double = scan1.nextDouble();
	
	System.out.println("the enterd value is");
	System.out.print(user_input_double);
	
Scanner scan2=new Scanner(System.in);
	
	System.out.println("Enter some float value");
	float user_input_float = scan2.nextFloat();
	
	System.out.println("the enterd value is");
	System.out.print(user_input_float);
	
Scanner scan3=new Scanner(System.in);
	
	System.out.println("Enter some string");
	String user_input_string = scan3.nextLine();
	
	System.out.println("the enterd string is");
	System.out.print(user_input_string);	
	}

}
