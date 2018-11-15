
public class CountWordsDemo {

	public static void main(String[] args) {

		String input = "i started loving java";
		int words = count(input);
		System.out.println("The original string:" + input);
		System.out.println("total no of words:" + words);

		input = "";
		words = count(input);
		System.out.println("The original string:" + input);
		System.out.println("total no of words:" + words);

		input = null;
		words = count(input);
		System.out.println("The original string:" + input);
		System.out.println("total no of words:" + words);

	}

	public static int count(String sentence) {
		if(sentence==null||sentence.isEmpty()){
		return 0;
		}
		String[] f = sentence.split("\\s+");
		
		return f.length;
	}

}
