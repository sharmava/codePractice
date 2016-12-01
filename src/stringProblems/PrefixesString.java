package stringProblems;

import java.util.ArrayList;
import java.util.List;

public class PrefixesString {
	 public static List<String> getAllPrefixes(String input){
         List<String> result = new ArrayList<String>();
         int length = input.length();
         if(input != null){
       	  for(int x=0;x<=length;x++){
       		  String temp = input.substring(0,x);
       		  result.add(temp);
       	  }
         }
         return result;
   }
   
   public static void main(String[] args){
   	String input = "Varun";
   	List<String> result = getAllPrefixes(input);
   	
   	for(String x : result){
   		System.out.println(x);
   	}
   	
   }
}
