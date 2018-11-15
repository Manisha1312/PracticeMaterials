package com.practice.stringEqual;

public class StringEqual {
	public static void main(String args[]) {
		  
        String input1 = "";
        String input2 = null;
        String input3 ="abc";
      
        //determine if String is empty using length method , also checks if string is null
        System.out.println("checking if String empty using length");
        System.out.println("String " + input1 + " is empty :" +isStringEmpty(input1) );
        System.out.println("String " + input2 + " is empty :" +isStringEmpty(input2) );
        System.out.println("String " + input3 + " is empty :" +isStringEmpty(input3) );
      
        //determine if String is empty using equals method
        System.out.println("find if String empty using equals");
        System.out.println("String " + input2 + " is empty :" +isStringEmptyByEquals(input2) );
      
         //determine if String is empty using isEmpty of Java 6
        System.out.println("find if String empty using isEmpty method of Java 6");
        System.out.println("String " + input3 + " is empty :" + input3.isEmpty());
      
       
    }
  
    public static boolean isStringEmpty(String input){
        if(input != null && input.length() == 0){
            return true;
        }
        return false;
    }
  
    public static boolean isStringEmptyByEquals(String input){
        return "".equals(input);
    }
}



