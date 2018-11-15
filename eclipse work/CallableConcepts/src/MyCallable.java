
public class MyCallable {
	
	int value;
	
	MyCallable(int value){
		this.value= value;
		
	}

	
	
	public Integer call(){
		int sum = 0;
		for(int i =0;i<value; i++){
			sum= sum+i;
			
		}
			
	System.out.println(sum);	
		return sum;
		
	}
}
