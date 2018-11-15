import java.util.HashMap;
import java.util.Map;

public class PrintDuplicates {

	public static void main(String[] args) {
		
		String input = "nick name are mani manish manii";
		Map<Character,Integer> m1 = new HashMap<>();
		
		// converted into characters
		
		char[]a = input.toCharArray();
		
		for(char dub:a){
			if (m1.containsKey(dub)){
				m1.put(dub,m1.get(dub)+1);
					}else{
				m1.put(dub, 1);		
					}
	
	}
		// traverse the map
		
		for(Map.Entry<Character,Integer>entry:m1.entrySet()){
			
			if(entry.getValue()>1){
				System.out.println(entry.getKey()+"  "+entry.getValue());
				
			}
			
		}
	}


}
