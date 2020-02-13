package hassane;
import java.util.*;

public class set {// hashset vs linkedset vs treeset : all of them remove duplicate and hashsed print randomly ,
	//linkedhashset print like i write em
	//treeset print alphabetical

	public static void main(String[] args) {
		
	/*	System.out.println("Hashset :");
		Set<String> fofo=new HashSet<String>();
		
		fofo .add("aaaaaa");
		fofo .add("bbbbbb");
		fofo .add("cccccc");
		fofo .add("dddddd");
		fofo .add("eeeeee");
		fofo .add("aaaaaa");
		    
		System.out.println(fofo.size());
		//System.out.println(fofo);
		
		for(String A:fofo){
			
			System.out.println(A);
			
		}
		
		System.out.println("LinkedHashset :");
		Set<String>  lina=new LinkedHashSet<String>();
		lina .add("hamo");
		lina .add("bousoir");
		lina .add("hamza");
		lina .add("ghochman");
		lina .add("zitout");
		lina .add("abrouk");
		
		System.out.println(lina.size());
		for(String jimy:lina){
		System.out.println(jimy);
		}
		
	System.out.println("Treeset");
	Set<String>  stores=new TreeSet<String>();
	stores .add("vvvvvv");
	stores .add("aaaaaa");
	stores .add("cccccc");
	stores .add("rrrrrr");
	stores .add("eeeeee");
	stores .add("aaaaaa");
	
	System.out.println(stores.size());
	for(String asia:stores){
	System.out.println(asia);
	
	}
	Object [] objectArray  = stores . toArray();
	System.out.println(objectArray .length);
	System.out.println(objectArray [1]);*/
	
	Map<String  , String>  cars=new HashMap<String , String>();
	cars. put("one" , "hola");
	System.out.println(cars.get("one"));
}
	
}

