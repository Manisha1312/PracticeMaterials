
public class CountVowels {

	public static void main(String[] args) {

		int count = 0;
		String input = "manisha mandal is a girl";

		// convert the string into array

		char[] a1 = input.toCharArray();

		for (char c : a1) {
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			default:
			}

		}
		
		System.out.println("the required input:"+input+"    "+count);

	}

}
