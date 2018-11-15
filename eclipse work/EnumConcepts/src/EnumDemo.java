
public class EnumDemo {
	
	enum Color{
		
		RED, BLUE,GREEN,PINK;
	}

	public static void main(String[] args) {
		
		Color c= Color.BLUE;
		
		System.out.println(c);
		
		Color d = Color.valueOf("RED");
		System.out.println(d);
	

	}

}
