package com.array;


public class UserMainCode {

	private static int output1;
	public static void main(String args[]) {
		UserMainCode t = new UserMainCode();
		System.out.println(""+t.getvalue());
		System.out.println(""+t.value);
	}
	
		static int value=1;
		public int getvalue(){
			try{
				value=value+1;
				return value;
			}
			catch(Exception e){
				return 0;
			}
			finally{
				value=value+1;
			}
			
		
	}

	private static void findSeriesNext(int[] a) {

	    if(CheckAP(a) == 1)
	    {
	    }else if(CheckGP(a) == 1){}
	    else {
	    	// CheckFib(a);
	    }
	}

	public static int CheckAP(int[] a)
	{
	    int iDiff=a[1]-a[0];
	    for(int i=0;i<a.length-1;i++)
	    {
	        if((a[i+1]-a[i])!=iDiff)
	            return -1;
	    }
	    output1 = a[a.length-1]+iDiff;
	    return 1;
	}

	public static int CheckGP(int[] a)
	{
	    int iRatio=a[1]/a[0];
	    for(int i=0;i<a.length-1;i++)
	    {
	        if((a[i+1]/a[i])!=iRatio)
	            return -1;
	    }
	    output1=a[a.length-1]*iRatio;
	    return 1;
	}
}
