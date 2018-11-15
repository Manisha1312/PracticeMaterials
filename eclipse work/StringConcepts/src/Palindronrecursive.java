
public class Palindronrecursive {

	public static void main(String[] args) {
		
		String input = "madam";
		String reverse = reverse(input);
		System.out.println(reverse);

	}

	public static String reverse(String sentence) {
		if (sentence==null||sentence.isEmpty()){
			return sentence;
			
		}
		
		
		return sentence.charAt(sentence.length()- 1) + reverse(sentence.substring(0, sentence.length() - 1));
		
	}

}
