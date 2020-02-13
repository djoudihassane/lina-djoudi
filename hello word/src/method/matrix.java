package method;

import java.util.Scanner;

public class matrix {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner (System.in);
		System.out.print("give me n number : ");// i use print not println because i want the number that i put in same line
		int n=obj .nextInt();
		for (int i =1 ; i<=n ;i++) {
			for(int j=1 ; j <=n ;j++) {
				System.out.print(i*j +"\t" );
				//System.out.print("  "); or "\t" to make space and "\n" to change line
				
			}
			System.out.println();
		}

	}

}
