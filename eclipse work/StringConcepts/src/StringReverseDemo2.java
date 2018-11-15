
public class StringReverseDemo2 {

	public static void main(String[] args) {
		
		String input = "manisha mandal like";
		String reverse = reverse(input);
		System.out.println(reverse);
		
		
		// by using string builder
		
		String builder = "hello manisha";
		String reverse1 = new StringBuilder(builder).reverse().toString();
		System.out.println(reverse1);
		
		// by string buffer
		
		String buffer = "hello ahmad";
		String reverse2 = new StringBuffer(buffer).reverse().toString();
		System.out.println(reverse2);
		
	}

	public static String reverse(String sentence) {
		if(sentence == null||sentence.isEmpty()){
			return sentence;
			
		}
		String reverse = "";
		for(int i =sentence.length()-1;i>=0;i--){
			reverse = reverse + sentence.charAt(i);
				
		}
		return reverse;
	}

}
