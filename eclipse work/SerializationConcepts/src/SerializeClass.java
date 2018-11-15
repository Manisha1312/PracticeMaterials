import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeClass {

	public static void serialize(UseVO user, String filename) throws IOException {
		
		FileOutputStream f1 = new FileOutputStream(filename);
		
		ObjectOutputStream oos = new ObjectOutputStream(f1);
		
		oos.writeObject(user);
		oos.close();
		
	}
	
	// desearilizatio
	
	public static Object deserialize(String filename) throws IOException, ClassNotFoundException{
		
		FileInputStream f2 = new FileInputStream(filename);
		ObjectInputStream oos2 = new ObjectInputStream(f2);
		Object obj   =   oos2.readObject();
		
		oos2.close();
		return obj;
		
	}
	
	

	

}
