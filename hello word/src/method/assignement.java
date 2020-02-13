package method;

import java.util.Scanner;

public class assignement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
	 Scanner sc=new Scanner (System.in);
	 System.out.print(" given n = ");
	 int n=sc.nextInt();
	
	if (n>=1) {
	 System.out.println("1");}
	
	 for(int i = 4;i<=n ; i=i+4) {
		 
		 System.out.print(i+","+"\n");
	 }
	
	 System.out.print(" given n = ");
	 int b=sc.nextInt();
	
	
	 for(int i = b;i>=0 ; i=i-4) {
		 
		 System.out.println(i);
	 }
	 
	 System.out.print(" enter n number : ");
	 int h=sc.nextInt();
	 
	 for(int i=h; i>=0; i--) {
		
		System.out.println(i);
	}}
	

}
