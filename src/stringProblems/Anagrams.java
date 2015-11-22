package stringProblems;

import java.util.Arrays;

public class Anagrams {
	public static void main(String[] args){
      String str1 = "varun";
      String str2 = "nuravs";
      
      if(str1.length() != str2.length()){
    	  System.out.println("Not anagrams");
      }else{
           if(sort(str1).equals(sort(str2))){
        	   System.out.println("Strings are anagrams");
           }else{
        	   System.out.println("Strings are not anagrams");
           }	  
      }
      
      
      
      
	}
	
	public static String sort(String data){
		String result = null;
		if(data.length() != 0){
			char[] dataA = data.toCharArray();
			Arrays.sort(dataA);
			result = new String(dataA);
		}
		return result;
	}
	
   
}
