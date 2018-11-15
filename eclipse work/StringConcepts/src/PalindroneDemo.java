
public class PalindroneDemo {

	public static void main(String[] args) {
	
		String input = "madam";
		
		String reverse = reverse(input);
     System.out.println("the required rteverse string is :" +reverse);
     
     if (input.equals(reverse)){
    	 System.out.println("the required string is palin");
    	 
     }
     else{
    	 System.out.println("the required string is not palin");
     	
    	 
     }
     
     
     
	}

	public static String reverse(String sentence) {
		if(sentence==null||sentence.isEmpty())
			return sentence;
		String reverse = "";
		
		for(int i = sentence.length()-1;i>=0;i--){
			
			reverse = reverse + sentence.charAt(i);
			
		}
		return sentence;
	}

}
