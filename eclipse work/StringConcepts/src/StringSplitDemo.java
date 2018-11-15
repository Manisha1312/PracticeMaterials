
public class StringSplitDemo {

	public static void main(String[] args) {
		
		String input = "manisha mandal";
		String [] str = input.split("\\s+");
		
		String input2 = "manisha|mandal|ahmad";
		String str2[] = input2.split("\\|",2);
		
		for(String s:str2){
			System.out.println(s);
			
		}
		
		
		
	}

}
