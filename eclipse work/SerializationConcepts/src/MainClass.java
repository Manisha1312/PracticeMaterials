import java.io.IOException;

public class MainClass {

	public static void main(String[] args) {
		
		
		UseVO user = new UseVO();
		user.setName("manisha");
		user.setUsername("manma");
		user.setPassword("angel");
		
		
		try {
			SerializeClass.serialize(user,"serilaization.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
   UseVO newUser = (UseVO)	SerializeClass.deserialize("serilaization.txt");
   System.out.println(newUser.toString());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
