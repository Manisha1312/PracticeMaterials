
public class PrintingPrime {

	public static void main(String[] args) {
		int a[] = {2,3,6,8,9,11,13,17,20};
		
		int result = prime(a);
		System.out.println(result);
	}

	public static int prime(int[] a) {
		for(int i =2;i<a.length;i++){
			if(i%2==0){
			return 0;		
			}
			
		}
		return 1;
		
	}

}
