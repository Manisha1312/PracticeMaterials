
public class RemoveFirstLastChar {

	public static void main(String[] args) {
		
		String s1 = "manisha";
		
		StringBuilder sb = new StringBuilder(s1);
		sb = sb.deleteCharAt(0);
		System.out.println("the required string is:"+sb);
		StringBuilder sb1 = new StringBuilder(s1);
		sb1= sb1.deleteCharAt(sb1.length()-1);
		System.out.println("the required string is:"+sb1);
		
		
		

	}

}
