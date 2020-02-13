package hassane;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		
		System.out.println("give me number devided by 10 ;");
		Scanner hassane=new Scanner(System.in);
        /* int N = hassane.nextInt();
		if(N==0) {
		throw  new ArithmeticException (" that an error");}
		System.out.println(10/N);*/

	try {
		
		int N = hassane.nextInt();
		
		System.out.println(10/N);
	}
	catch(ArithmeticException E) {
		System.out.println(" cant devit by zero");
	
		
	}
	catch(InputMismatchException E) {
		System.out.println(" you cant devide integer by string");}
		
	finally {
		System.out.println(" hello word ");
	}
		
	
	}}
