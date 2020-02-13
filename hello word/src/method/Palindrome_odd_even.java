package method;

import java.util.Scanner;

public class Palindrome_odd_even {

	public static void main(String[] args) {
		

		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter you word");
		String original , reverse= "";
		original =sc .nextLine();
		
		int len=original.length();
		
		for (int i = len -1;i>=0;i--)
		
		reverse=reverse + original.charAt(i);{
		
		if(original.equals(reverse))
			System.out.println("is a palindrome");
		
		else
			System.out.println("is not palindrome");}}}
		
		

