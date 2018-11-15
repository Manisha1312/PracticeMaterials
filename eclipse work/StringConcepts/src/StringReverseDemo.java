
public class StringReverseDemo {

	public static void main(String[] args) {
		//String input = "manisha";
		String input = "ahmad manisha";
		String reverse = reverse(input);
		System.out.println("The reverse string is :"+reverse);

	}

	public static String reverse(String sentence) {
		if(sentence==null||sentence.isEmpty()){
			return sentence;
		}
		String reverse = "";
		
		for(int i= sentence.length()-1;i>=0;i--){
			reverse = reverse + sentence.charAt(i);
			
		}
	

		return reverse;
	}

}
