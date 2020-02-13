package hassane;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Randomnumber {

	public static void main(String[] args) {
		
		Set<Integer> hh=new TreeSet<Integer>();
		
		Random  hoari=new Random ();
		//int hassane = hoari.nextInt();
		
		//System.out.println(hassane);
		
		/*for(int i=1 ; i <=500 ; i++) {
			System.out.print(i + ":");
			int hassane = hoari.nextInt((1000-100)+1)+100;
			if(hassane>100) {
			System.out.println(hassane);
			}
			else {
				System.out.println("less than 100 >>"+ hassane);
			}
		}
*/
		
		while( hh.size()<500) {
			
			int hassane = hoari.nextInt((1000-100)+1)+100;
			hh.add(hassane);
			//System.out.print( ":");	
		}
		System.out.println(hh);
		System.out.println(hh.size());
	}

}
