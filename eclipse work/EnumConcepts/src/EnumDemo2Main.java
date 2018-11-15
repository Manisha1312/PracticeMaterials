// enum with switch case
public class EnumDemo2Main {
	
	DayClass day;
	
	public EnumDemo2Main(DayClass day){
		
		this.day = day;
		
	}
	
	public void calculationDay() {
		switch(day){
		
		case MONDAY:
			System.out.println("THIS IS MONDAY");
			break;
		case TUESDAY:
			System.out.println("THIS IS MONDAY");
			break;
		case WEDNESDAY:
			System.out.println("THIS IS MONDAY");
			break;
		case THURSDAY:
			System.out.println("THIS IS MONDAY");
			break;
		default:
		
			System.out.println("THIS IS MONDAY");
			break;
		
		}
		
		
	}
	
	

	public static void main(String[] args) {
		
		String str = "MONDAY";
		
		EnumDemo2Main e1 = new EnumDemo2Main(DayClass.valueOf(str));
		
		e1.calculationDay();
		
		

	}

















	
	
	
	
	
	

}
