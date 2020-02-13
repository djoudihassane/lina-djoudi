package method;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class calculator {

	public static void main(String[] args) {
		double num1;
        double num2;
        char operation;
       
        Scanner input=new Scanner(System.in);
         //input.close();//to remove the yellow worning
        System.out.println("enter the first number  :");

	      num1= input.nextDouble();
	   
	      System.out.println("enter the second number :");

	      num2= input.nextDouble();
	
	      Scanner op=new Scanner(System.in);
	    
	       // op.close();
	      System.out.println("enter the operator  :");

	       operation= op.next().charAt(0);
	       
	       if(operation == ('+')) {
	    	   
	    	   System.out.println("the answer is : "+(num1  +  num2));
	    	   }
           
	        if(operation == ('-')) {
		    	   
	    	 System.out.println("the answer is : "+(num1  -  num2)); 
		    	 }  
	      
	         if(operation == ('/')) {
			    	   
			     System.out.println("the answer is : "+(num1  /  num2));
			     }
	         if(operation == ('*')) {
		    	   
			     System.out.println("the answer is : "+(num1  *  num2));
			     }
	         
	         if(operation == ('%')) {
		    	   
			     System.out.println("the remainder is : "+(num1  %  num2));
			     }
	    	   
	       
	
	
	
	}
	
}


