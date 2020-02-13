package constructor;


public  class child extends parent {
	
	
	public static void main(String[]args) {
		//parent b=new parent ();
		c1();
		
	     c3();
	  //   b1();
//		System.out.println(b);
		System.out.println(a);
//		System.out.println(x);
		child hh=new child();
		hh.b1();
//		hh.aa();
		System.out.println("my modified value"+hh.getparent());
//     // System.out.println( hh .jj());
//		// using super keyword if i override the parent method and i want to print both mine and parent too i have to use super
//	//and in order to super cant not use it in static method
//	
	}
  //static int x=500; // having same varuable in parent thats overwrite
//	static int b=100;
	static int a=99;
//	
	public  int getparent() {
		return super.a;
	}
//	
//	
//public static void b1() {
//		
//		System.out.println("my b value");
//   
//}
public void b1() {
	System.out.println("hello world");
	super.b1();
}
//public static void c3() {
//	
//	System.out.println("my value");}
//
//	 
//
//	public static void a2() {
//	
//	System.out.println("a2");
//	}
// public void aa() {
//	 super.c3();
 }

