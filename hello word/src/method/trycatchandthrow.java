package method;

import java.util.InputMismatchException;
import java.util.Scanner;

public class trycatchandthrow {

	public static void main(String[] args) {
		System.out.print("please give number : ");
		Scanner obj = new Scanner(System.in);
		int hassane=obj.nextInt();
		
        if (hassane==0) {
        	
        	throw new ArithmeticException("can not devide it by zero");
        }
        else {
        	System.out.println(10/hassane);
        }
        
        System.out.println("hoari ");
        
        
		/*try {
			
			System.out.print("please give number : ");
			Scanner obj = new Scanner(System.in);
			int hassane=obj.nextInt();
			System.out.println(10/hassane);
			
			
		}
		catch (ArithmeticException e) {
			
			System.out.println("why you give me zero");
			
		}
        catch (InputMismatchException e) {
			
			System.out.println("im sorry i cant run it with those caractire ");
			
		}
		
			finally {// with finally even i didnt catch it still i run the code
				
				
				System.out.println("even i got error still in run last code");
			}*/
			
			
			
		}
		
		
	}


