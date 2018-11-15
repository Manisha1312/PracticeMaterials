import java.util.Arrays;

public class AnagramDemo1 {

	public static void main(String[] args) {
		isAnagram("peek","K eeP");

	}

	public static void isAnagram(String string1, String string2) {
		
		// rempve the extra spaces
		
		String s1 = string1.replaceAll("\\s", "");
		String s2 = string2.replaceAll("\\s", "");
		
		
		// check if both the string having equal length
		boolean status = true;
		if(s1.length()!=s2.length()){
			status = false;
		}
		else{
			// conver into lowercase and chararray
			
			char[]s1Array = s1.toLowerCase().toCharArray();
			char[]s2Array = s2.toLowerCase().toCharArray();
			
			// sort the array
			
			Arrays.sort(s1Array);
			Arrays.sort(s2Array);
			
			// equal 
			
			status = Arrays.equals(s1Array, s2Array);
			System.out.println("the status is"+status);
		}
		
		if (status){
			System.out.println("the required string are anagram");
		}
		else{
			System.out.println("the required string are not anagram");
		}
		
	}

}
