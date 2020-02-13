package javatoturial;
import java .util.*;
public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> hassane=new ArrayList<String>();
		hassane.add("hhhhhhhh");
		hassane.add("kkkkkkkk");
		hassane.add("llllllll");
		
		hassane.remove(2);// if you want remove item
		
		
		System.out.println(hassane.get(1)); // to get item 
		System.out.println(hassane.size()); // to get size mean length
		
		ArrayList<Integer> number=new ArrayList<Integer>();
		for(int i=0 ; i <=100 ; i++) {
			
			number.add(i);
			
		}
		System.out.println(number);
	}

}
