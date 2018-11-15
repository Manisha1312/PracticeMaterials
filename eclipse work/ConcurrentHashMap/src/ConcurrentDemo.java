import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentDemo {

	public static void main(String[] args) {
		
		// concurrent HashMap
		
		Map <String,String> myMap = new ConcurrentHashMap<>();
		
		myMap.put("1", "1");
		myMap.put("2", "1");
		myMap.put("3", "2");
		myMap.put("4", "3");
		myMap.put("5", "4");
		
		System.out.println("ConcurrentHashMap before iterator: "+myMap);
		
		// ITERATIONG THROUGH MAP USING FOR EACH LOOP
		
//		for(Map.Entry<String,String> entry: myMap.entrySet()){
//			System.out.println(entry.getKey()+"  "+entry.getValue());
//			
//		}
		
		// iteration through iterator
		
		Iterator itr = myMap.keySet().iterator();
		
		while(itr.hasNext()){
			
		//	Object key = itr.next();
			
			if(itr.next().equals("3")){
				myMap.put("3new", "new3");
							
			}
			
			
		}
		
		System.out.println("ConcurrentHashMap  "+myMap);

	}

}
