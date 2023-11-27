package Hashmap;

import java.util.HashMap;


public class HashMap_Example2 {
	static boolean answer=false;
	//private static HashMap<String, String> hashmap; 
	


@SuppressWarnings("null")
public static void main(String[] args) {
		


    HashMap<String, String> hashmap2=new HashMap<String, String>();
    hashmap2.put("6", "dudeguy");
    System.out.println(hashmap2.get("6"));



   // HashMap<String, String> hashmap = null;
	//String oval;
//Object key;
//System.out.println("contains: "+hashmap2.compute("detach",(key,oval)-,(val.concat("SK"));
    //System.out.println("contains: "+hashmap.get("dude"));
    System.out.println(hashmap2.equals(2));

    System.out.println(hashmap2.keySet());
    System.out.println(hashmap2.getOrDefault("Name", "SK"));

    System.out.println(hashmap2.keySet());
    System.out.println(hashmap2.entrySet());
    
    String search = "6";
	
	//HashMap<String, String> hashmap = null;
	hashmap2.forEach((key,value) ->{
		//CharSequence search = null;
		if(key.contains(search)||value.contains(search)) {
			answer=true;
		}
	});
	
	
	//String answer = null;
	System.out.println(search+"contains "+answer);
	

}
}