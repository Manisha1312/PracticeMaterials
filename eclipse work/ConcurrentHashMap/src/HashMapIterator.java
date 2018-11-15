import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIterator {

	public static void main(String[] args) {
		 Map<String,String> myMap = new HashMap<String,String>();
		myMap.put("1", "2");
		myMap.put("2", "3");
		myMap.put("3", "4");
		myMap.put("4", "5");
		myMap.put("5", "6");
		myMap.put("6", "7");
		System.out.println("HashMap before iterator: "+myMap);
		Iterator<String> it1 = myMap.keySet().iterator();

		while(it1.hasNext()){
			String key = it1.next();
			if(key.equals("3")) myMap.put(key+"new", "new3");
			break;
		}
		System.out.println("HashMap after iterator: "+myMap);

	}

}
