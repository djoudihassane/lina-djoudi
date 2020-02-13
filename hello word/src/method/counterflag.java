package method;

import java.util.InputMismatchException;
import java.util.Scanner;

public class counterflag {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		System.out.print(" give number ;");
		int hassane=obj.nextInt();
		
		
		if(hassane ==hassane) {
		throw new InputMismatchException("you need to give number");
		}
	
	boolean flag=true;
	if(hassane>100) {
		flag=false;
		System.out.println("flag is false");
	}
		if(flag) {
			
			int counter=0;
			
			for(int i =1 ; i <=hassane ; i++) {
				if(i%2==0) {
					counter++;
					
				}										
			}
			
			System.out.println("there are "+ counter + " even");
			
			
		}
		}
}
