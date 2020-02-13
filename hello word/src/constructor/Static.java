package constructor;

public class Static {
	
	static  int a=10;
	  int b=55;

	public static  void ac() {
		System.out.println(a);
	}
	
	
	public static  int getA() {
		return a;
	}

	public static  void setA(int a) {
		Static.a = a;
	}
	
	public  void  abc () {
		
		Static hoari=new Static();
		
		this.a=22;
	System.out.println("print value "+ hoari.a);
		
	}
    
	public void abctwo() {
		Static hoari=new Static();
		System.out.println("print value"+hoari. a);
	}


 public  void xyz() {
  
                                            //we do need object because non static to non static
	    this.b=88;
	        
	          System.out.println(b);
	  
  }
 public  void xyztwo() {
	// Static hoari=new Static();
	 
	      System.out.println("print value  "+  b);
 }





}
