
public class AnagramDemo2 {

	public static void main(String[] args) {
		isAnagram("Peek","K e e P");
	}

	public static void isAnagram(String string1, String string2) {
		
		
		String s1 = string1.replaceAll("\\s","").toLowerCase();
		String s2 = string2.replaceAll("\\s", "").toLowerCase();
		
		boolean status = true;
		
		if(s1.length()!=s2.length()){
			status = false;
			
		}else{
			
			char[] s1Array = s1.toCharArray();
			StringBuilder sb = new StringBuilder(s2);
			
			
			// if s1Array is present in builder or not
			
			for(char c : s1Array){
				
				int index = sb.indexOf(""+c);
				if(index!=-1){
				sb	= sb.deleteCharAt(index);
				}
				else{
					status = false;
				}
					
			}
			
			
			if(status){
				System.out.println("anagram");
			}else{
				System.out.println("not anagram");
				
			}
			
		}
		
		
	}

}
