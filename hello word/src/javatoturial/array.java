package javatoturial;

public class array {

	public static void main(String[] args) {
		
		String[]student= {"hassane", "zohra" , "lina" ,"hamadi"};
		    System.out.println(student[2]);
		    System.out.println(student.length);//print lenth
		   
		    
		student =new String[4];
		 student[0]="lola";
		 student[1]="lala";
		 student[2]="nona";
		 student[3]="mama";
		 System.out.println(student[3]);
		 for(String boka:student) {     // using for each to print all of items
			 System.out.println(boka);
		 }
		
		 
		 char[] dada =new char[5];
		 dada[0]='d';
		 dada[1]='s';
		 dada[2]='c';
		 System.out.println(dada[0]);
}
	}
