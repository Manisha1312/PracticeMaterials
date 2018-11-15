
public class ValuesEnumDemo {

	public static void main(String[] args) {

   DayClass[]a = DayClass.values();
   
   for(DayClass b : a){
	
	   
	   
	   System.out.println(b+"index"+b.ordinal());
	   System.out.println(DayClass.valueOf("TUESDAY"));
	   
   }

	}

}
