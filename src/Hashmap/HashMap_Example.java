package Hashmap;

import java.util.HashMap;

public class HashMap_Example {
	static boolean answer=false;

	public static void main(String[] args) {
		HashMap<String, String> hashmap=new HashMap<String, String>();
		
		hashmap.put("Name","SanthoshKumar");
		hashmap.put("Age", "26");
		hashmap.put("Gender", "Male");
		hashmap.put("place", "Tirupur");
		hashmap.put("etc", "...");
		
		System.out.println(hashmap.get("Name"));;
		System.out.println(hashmap.get("Age"));;
		System.out.println(hashmap.get("Gender"));
		System.out.println(hashmap.get("place"));
		System.out.println(hashmap.get("etc"));;
		System.out.println(hashmap.size());;
		System.out.println("contains: "+hashmap.containsKey("address"));
		System.out.println("contains: "+hashmap.containsKey("Name"));
		//System.out.println("contains: "+hashmap.remove("Name"));
		System.out.println("contains: "+hashmap.containsKey("Name"));
		System.out.println("contains: "+hashmap.containsKey("Gender"));
		System.out.println("contains: "+hashmap.remove("Gender"));
		
		
		
		System.out.println("contains: "+hashmap.clone());
		System.out.println("contains: "+hashmap.values());
		
		System.out.println(hashmap.keySet());
		System.out.println(hashmap.entrySet());
		
		
		
		String search = "Name";
		hashmap.forEach((key,value) ->{
			//CharSequence search = null;
			if(key.contains(search)||value.contains(search)) {
				answer=true;
			}
		});
		
		
		System.out.println(search+"contains "+answer);
	
		
		hashmap.clear();
		System.out.println("contains: "+hashmap.entrySet());
		System.out.println("contains:"+hashmap.isEmpty());
		
		
		
			
		}
	
		
		

	

}
